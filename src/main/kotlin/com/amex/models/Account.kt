package com.amex.models

import java.time.LocalDate

class Account : Any{
    var runningTotals: Long=0
    lateinit var openingDate: LocalDate

    constructor(_runningTotals:Long, _openingDate: LocalDate) {
        this.runningTotals=_runningTotals
        this.openingDate=_openingDate
    }
}