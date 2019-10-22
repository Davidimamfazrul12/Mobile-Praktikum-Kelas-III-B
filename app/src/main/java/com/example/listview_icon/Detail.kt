package com.example.listview_icon

object Detail {
    private val foodName = arrayOf(
        "bakso",
        "indomie",
        "kfc",
        "martabak",
        "nasi goreng",
        "pecal",
        "sate padang",
        "sosis",
        "soto",
        "steak"
    )

    private val detail = arrayOf(
        "bakso adalah makan asal jawa tengah",
        "indomie adalah makanan khas indonesia yang berasal dari banyak daerah",
        "kfc adalah makanan yang berasal dari negara amerika",
        "martabak adalah makan yang berasal dari daerah banka belitung",
        "nasi goreng adalah makanan khas indonesia",
        "pecal adalah makanan khas dari daerah madiun",
        "sate padang adalah makanan yang berasal dari padang",
        "sosis adalah makanan khas dari berbagai negara",
        "soto adalah makanan yang khas indonesia yang berasal dari berbagai daerah",
        "steak adalah makanan yang berasal dari negara inggris"
    )

    private val foodPoster = intArrayOf(
        R.drawable.bakso,
        R.drawable.indomie,
        R.drawable.kfc,
        R.drawable.martabak,
        R.drawable.nasigoreng,
        R.drawable.pecal,
        R.drawable.sate,
        R.drawable.sosis,
        R.drawable.soto,
        R.drawable.steak
    )

    val listFood: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodName.indices) {
                val food = Food()
                food.name = foodName[position]
                food.detail = detail[position]
                food.poster = foodPoster[position]
                list.add(food)
            }
            return list
        }
}