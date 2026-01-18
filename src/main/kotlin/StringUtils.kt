package org.example

private fun normalize(input: String): String {
    return input.trim().lowercase()
}

internal fun formatName(name: String): String {
    return normalize(name).replaceFirstChar { it.uppercase() }
}

fun printName(name: String) {
    println(formatName(name))
}