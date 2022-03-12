package com.example.bissmillahlulus

import java.util.*


object AnimalsData {
    private val animalsNames = arrayOf("Angsa",
        "Ikan Arwana",
        "Ayam",
        "Badak Jawa",
        "Banteng",
        "Belalang",
        "Burung Beo",
        "Bintang Laut",
        "Capung",
        "Citah",
        "Cumi")

    private val animalsDetails = arrayOf("Angsa adalah anggota terbesar dari famili Anatidae, dan merupakan salah satu burung air terbesar yang dapat terbang. Taksonomi Angsa adalah sebagai berikut " +
            "\nKingdom : Animalia\n" +
            "\n" +
            "Filum : Chordata\n" +
            "\n" +
            "Kelas : Aves\n" +
            "\n" +
            "Ordo : Anseriformes\n" +
            "\n" +
            "Famili : Anatidae\n" +
            "\n" +
            "Genus : Cygnus\n" +
            "\n" +
            "Spesies : Cygnus olor",
        "Arwana Asia adalah spesies asli sungai-sungai di Asia Tenggara khususnya Indonesia. Taksonomi Ikan Arwana sebagai berikut" +
                "\nKingdom : Animalia\n" +
                "\n" +
                "Filum : Chordata\n" +
                "\n" +
                "Kelas : Actinopterygii\n" +
                "\n" +
                "Ordo : Osteoglossiformes\n" +
                "\n" +
                "Famili : Osteoglossidae\n" +
                "\n" +
                "Genus : Osteoglossum\n" +
                "\n" +
                "Spesies : Osteoglossum bicirrhosum.",
        "Ayam (Gallus gallus domesticus) adalah unggas yang biasa dipelihara orang untuk dimanfaatkan untuk keperluan hidup pemeliharanya. " +
                "\nKingdom : Animalia\n" +
                "\n" +
                "Filum : Chordata\n" +
                "\n" +
                "Kelas : Aves\n" +
                "\n" +
                "Ordo : Galliformes\n" +
                "\n" +
                "Famili : Phasianidae\n" +
                "\n" +
                "Genus : Gallus\n" +
                "\n" +
                "Spesies : Galus gallus.",
        "Badak Jawa (Rhinoceros sondaicus, disebut juga Badak Sunda atau badak bercula satu kecil) adalah sebuah anggota famili Rhinocerotidae dan salah satu dari lima spesies badak yang masih ada pada saat ini." +
                "\nKingdom : Animalia\n" +
                "\n" +
                "Filum : Chordata\n" +
                "\n" +
                "Kelas : Mammalia\n" +
                "\n" +
                "Ordo : Perissodactyla\n" +
                "\n" +
                "Famili : Rhinocerotidae\n" +
                "\n" +
                "Genus : Rhinoceros (semua jenis badak)\n" +
                "\n" +
                "Spesies : Rhinoceros sondaicus.",
        "Banteng (dari bahasa Jawa: banthèng; nama spesies: Bos javanicus) atau tembadau adalah spesies hewan yang sekerabat dengan sapi dan ditemukan di berbagai wilayah Asia Tenggara. " +
                "\nKingdom : Animalia\n" +
                "\n" +
                "Filum : Chordata\n" +
                "\n" +
                "Kelas : Mammalia\n" +
                "\n" +
                "Ordo : Artiodactyla\n" +
                "\n" +
                "Famili : Bovidae\n" +
                "\n" +
                "Genus : Bos\n" +
                "\n" +
                "Spesies : Bos javanicus.",
        "Belalang adalah serangga herbivora dari subordo Caelifera dalam ordo Orthoptera. Serangga ini memiliki antena yang hampir selalu lebih pendek dari tubuhnya dan juga memiliki ovipositor pendek." +
                "\nKingdom : Animalia\n" +
                "\n" +
                "Filum : Arthropoda\n" +
                "\n" +
                "Kelas : Insecta\n" +
                "\n" +
                "Ordo : Orthoptera (semua jenis belalang)\n" +
                "\n" +
                "Famili : Acrididae\n" +
                "\n" +
                "Genus : Acrida\n" +
                "\n" +
                "Spesies : Acrida conica.",
        "Beo, mamiang, atau tiong emas (Gracula) adalah sejenis burung anggota suku Sturnidae (jalak dan kerabatnya)." +
                "\nKingdom : Animalia\n" +
                "\n" +
                "Filum : Chordata\n" +
                "\n" +
                "Kelas : Aves\n" +
                "\n" +
                "Ordo : Passeriformes\n" +
                "\n" +
                "Famili : Sturnidae\n" +
                "\n" +
                "Genus : Gracula (semua jenis burung beo).",
        "Bintang laut merupakan hewan simetri radial dan umumnya memiliki lima atau lebih lengan. Bintang laut tidak memiliki rangka yang mampu membantu pergerakan." +
                "\nKingdom : Animalia\n" +
                "\n" +
                "Filum : Echinodermata\n" +
                "\n" +
                "Kelas : Asteroidea (semua jenis bintang laut)\n" +
                "\n" +
                "Ordo : Forcipulatida\n" +
                "\n" +
                "Famili : Asteriidae\n" +
                "\n" +
                "Genus : Pisaster\n" +
                "\n" +
                "Spesies : Pisaster ochraceus.",
        " Capung umumnya bertubuh relatif besar dan hinggap dengan sayap terbuka atau terbentang ke samping. " +
                "\nKingdom : Animalia\n" +
                "\n" +
                "Filum : Arthropoda\n" +
                "\n" +
                "Kelas : Insecta\n" +
                "\n" +
                "Ordo : Odonata (semua jenis capung)\n" +
                "\n" +
                "Famili : Aeshnidae\n" +
                "\n" +
                "Genus : Aeshna\n" +
                "\n" +
                "Spesies : Aeshna multicolor.",
        "Citah berburu mangsa dengan menggunakan kecepatan dan bukan taktik mengendap-endap atau bergerombol. Hewan ini adalah hewan yang tercepat di antara hewan darat dan dapat mencapai kecepatan 110 km/jam dalam waktu singkat sampai 460 m, dengan akselerasi 0 – 100 km/jam dalam waktu 3,5 detik, lebih cepat dari beberapa mobil balap." +
                "\nKingdom : Animalia\n" +
                "\n" +
                "Filum : Chordata\n" +
                "\n" +
                "Kelas : Mammalia\n" +
                "\n" +
                "Ordo : Carnivora\n" +
                "\n" +
                "Famili : Felidae\n" +
                "\n" +
                "Genus : Acinonyx\n" +
                "\n" +
                "Spesies : Acinonyx jubatus.",
        "Cumi-cumi adalah kelompok hewan sefalopoda besar atau jenis moluska yang hidup di laut. " +
                "\nKingdom : Animalia\n" +
                "\n" +
                "Filum : Mollusca\n" +
                "\n" +
                "Kelas : Cephalopoda\n" +
                "\n" +
                "Ordo : Teuthida (semua jenis cumi-cumi)\n" +
                "\n" +
                "Famili : Mastigoteuthidae\n" +
                "\n" +
                "Genus : Mastigoteuthis\n" +
                "\n" +
                "Spesies : Mastigoteuthis flammea.")

    private val animalsImages = intArrayOf(R.drawable.angsa,
        R.drawable.arwana,
        R.drawable.ayam,
        R.drawable.badak,
        R.drawable.banteng,
        R.drawable.belalang,
        R.drawable.beo,
        R.drawable.bintang,
        R.drawable.capung,
        R.drawable.citah,
        R.drawable.cumi)

    val listData: ArrayList<Animal>
        get() {
            val list = arrayListOf<Animal>()
            for (position in animalsNames.indices) {
                val animal = Animal()
                animal.photo= animalsImages[position]
                animal.name= animalsNames[position]
                animal.detail= animalsDetails[position]

                list.add(animal)
            }
            return list
        }
}