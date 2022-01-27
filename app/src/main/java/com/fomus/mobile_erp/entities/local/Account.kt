package com.fomus.mobile_erp.entities.local

data class Account(var accountName:String,var accountLogin:String,var companyName:String,var serverUrl:String){
    constructor():this(
        "","","",""
    )
}
