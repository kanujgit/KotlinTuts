package com.kotlin.kotlindsl

class DslDemo {
    fun build(): String {
        return "build"
    }

    fun query(initlizer: SqlSelectBuilder.() -> Unit): SqlSelectBuilder {
        return SqlSelectBuilder().apply { initlizer }
    }
}

class SqlSelectBuilder {

    private val columns = mutableListOf<String>()
    fun select(vararg columns: String) {
        if (columns.isEmpty()) {
            throw IllegalArgumentException("At least one column should be defined")
        }
        if (this.columns.isNotEmpty()) {
            throw IllegalStateException(
                "Detected an attempt to re-define columns to fetch. "
                        + "Current columns list: "
                        + "${this.columns}, new columns list: $columns"
            )
        }
        this.columns.addAll(columns)
    }
}


fun main(args: Array<String>) {
    val dslDemo = DslDemo()
    dslDemo.query {
        select("coloumn1 ", "column2")
    }


    fun buildString(action: (StringBuilder) -> Unit): String {
        val sb = StringBuilder()
        action(sb)
        return sb.toString()
    }

    val str = buildString {
        it.append("anuj")
        it.append("kumar")
        it.reverse()

    }
    println(str)
}