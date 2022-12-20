package oop.gettersetter

class Note(title: String) {

    var title: String = title
        get() = field
        set(value) {
            if (value.isNotBlank()){
                field = value
            }
        }

}
