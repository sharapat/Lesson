package uz.texnopos.lesson

data class MyModel(
    val firstName: String,
    val lastName: String,
    var temalar: List<String>,
    var isExpanded: Boolean = false
)
