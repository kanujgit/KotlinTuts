package com.kdroid.kotlintuts.kotlin.deligate

class MediaFiles(private val downloader: Downloader, private val player: Player) :
    Downloader by downloader,
    Player by player

class FileDownloader(private var file: String) : Downloader {

    override fun downloader() {
        println("$file downloaded")
    }
}

class FilePlayer(private var file: String) : Player {

    override fun player() {
        println("$file playing")
    }
}


fun main(args: Array<String>) {

    var file: String = "file.mkv"
    var mediaFiles = MediaFiles(FileDownloader(file), FilePlayer(file))
    mediaFiles.player()
    mediaFiles.downloader()

}