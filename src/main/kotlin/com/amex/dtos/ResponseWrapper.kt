package com.amex.dtos

class ResponseWrapper<T> {

    var message:String?=null
    var payload:T?=null

    constructor(_message:String){
        this.message=_message
    }


    constructor(_payload:T){
        this.payload=_payload
    }

    override fun toString(): String {
        return "ResponseWrapper(message='$message', payload=$payload)"
    }

}