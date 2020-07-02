package com.example.madlevel7example

class Note(title: String, content: String) {

    var question: String? = title
    var answer: String? = content

    fun toMap(): Map<String, Any> {

        val result = HashMap<String, Any>()
        result["question"] = question!!
        result["answer"] = answer!!

        return result
    }
}