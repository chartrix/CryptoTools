package com.mx.datio

class DataTransformation(url: String, speed: Int){
    var urlData:    String = url
    var speedData:  Int    = speed
    override def toString(): String = "(" + urlData + "," + speedData + ")"
}
