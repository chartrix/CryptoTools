package com.mx.datio

class Consumer(url: String, speed: Int){
    var urlData:    String = url
    var speedData:  Int    = speed

    override def toString(): String = "(" + urlData + "," + speedData + ")"
}
