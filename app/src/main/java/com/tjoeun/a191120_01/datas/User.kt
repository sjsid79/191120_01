package com.tjoeun.a191120_01.datas

class User (name:String, address:String) {
    var name = name
    var address = address

    override fun equals(other: Any?): Boolean {
        var result = false

        var otherUser = other as User

        if (this.name == otherUser.name && this.address == otherUser.address){
            result = true
        }

        return  result
    }
}