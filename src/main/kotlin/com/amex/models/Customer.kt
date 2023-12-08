package com.amex.models

//class Customer constructor(_name : String, _accNo : Long , _email : String , _pass : String ,
//     _contactNo : Long= 23254455445323) {
//     var name = _name
//     var accNo = _accNo
//     var email = _email
//     var pass = _pass
//     var contactNo = _contactNo
//
//     constructor():this(_name = "hasd", 97876655, "hardik@gmail.com", "dummypass",4544) {
//
//     }
//}



abstract class Customer {

     internal open val code = "c"
     var name = ""
      var accNo : Long = 0
      var email = ""
      var pass = ""
      var contactNo : Long=  0
     // lateinit- dis advantage
     lateinit var address : Address


     constructor()
     constructor(_name : String, _accNo : Long , _email : String , _pass : String ,
                 _contactNo : Long= 23254455445323, _address : Address) {
           name = _name
          accNo = _accNo
          email = _email
           pass = _pass
          contactNo = _contactNo
          address = _address
     }
//          constructor(_accNo: Long):this(_name = "hasd",_accNo, "hardik@gmail.com", "dummypass",4544, _address = Address()) {
//
//          }
     companion object{
          var counter=0
          fun showData(): Int{
               return counter;
          }
     }

     //instance block and increment the counter
     init{
          counter++
     }

     //instance method
     fun showCounter() : Int{
          return counter
     }
//     open fun showCustomerData (): String {
//          return this.name + " " + this.contactNo;
//     }

     }
