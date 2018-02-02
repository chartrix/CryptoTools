package com.mx.datio

class Consumer(url: String, speed: Int, timy: Float){
    var urlData:    String = url
    var speedData:  Int    = speed
    var timeStop:   Float  = timy
    override def toString(): String = "(" + urlData + "," + speedData + ")"
}
