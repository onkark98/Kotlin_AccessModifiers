package org.example

class Dog: Animal() {
    fun action() {
        breathe() //Visible in subclasses
    }
}