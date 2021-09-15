//
// Created by Anuj Kumar on 14/09/21.
//

#include "native-lib.h"
#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_ndk_NdkDemo_stringToJni(JNIEnv *env, jobject thiz) {

    std::string hello = "Hello jni";
    return env->NewStringUTF(hello.c_str());
}
extern "C"
JNIEXPORT jint JNICALL
Java_com_ndk_NdkDemo_add(JNIEnv *env, jobject thiz, jint x, jint y) {
    return x + y;
}
extern "C"
JNIEXPORT jint JNICALL
Java_com_ndk_NdkDemo_sub(JNIEnv *env, jobject thiz, jint x, jint y) {
    return x - y;
}
extern "C"
JNIEXPORT jint JNICALL
Java_com_ndk_NdkDemo_multiply(JNIEnv *env, jobject thiz, jint x, jint y) {
    return x * y;
}
extern "C"
JNIEXPORT jint JNICALL
Java_com_ndk_NdkDemo_divide(JNIEnv *env, jobject thiz, jint x, jint y) {
    return x / y;
}