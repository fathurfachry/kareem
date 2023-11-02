package com.fachry.kareem.model

object DataAdabSunnahModel {

    private val titleAdab = arrayOf(
        "Adab Kepada Orangtua",
        "Adab Kepada Teman",
        "Adab kepada Guru"
    )

    private val contentAdab = arrayOf(
        "1. Tidak Meninggikan Suara " +
                "\n " +
                "Ketika sedang berbicara dengan orang tua, jangan meninggikan suara. Merendahkan suara dan tidak memandang tajam tergolong sebagai akhlak yang mulia dan sikap penghormatan yang sangat layak untuk diterapkan. \n 2. Tidak Mendahului dalam Berkata-kata \n empersilakan serta membiarkan orang tua untuk berkata-kata terlebih dahulu dapat menyenangkan hati orang tua. Hal ini dicontohkan dalam hadits riwayat Abdullah bin Umar RA, ia berkata:\n" +
                "\n" +
                "\"Kami pernah bersama Nabi SAW di Jummar, kemudian Nabi bersabda: 'Ada sebuah pohon yang ia merupakan permisalan seorang muslim' Ibnu Umar berkata: 'Sebetulnya aku ingin menjawab pohon kurma. Namun karena aku yang paling muda di sini maka aku diam,' Lalu Nabi SAW pun memberi tahu jawabannya (kepada orang-orang): 'ia adalah pohon kurma\" (HR Bukhari)" +
                "\n" +
                "Ibnu Umar RA melakukan hal tersebut karena adanya sahabat lain usianya lebih tua meski bukan orang tuanya. " +
                "\n" +
                " 3. Taat kepada Kedua Orang Tua " +
                "\n" +
                "Seorang muslim harus taat kepada kedua orang tua yang membesarkannya selama mereka tidak mendurhakai Allah SWT. Bahkan, hukum menaati kedua orang tua menjadi kewajiban bagi seorang muslim.",

        "1. Memilih Teman yang Baik " +
                "\n " +
                "Ketika seseorang memiliki teman yang baik, maka ia akan mendapatkan pengaruh yang baik pula. Sebaliknya, bergaul dengan teman yang buruk akan memberikan pengaruh yang buruk.\n" +
                "\n" +
                "Nabi Muhammad SAW bersabda, \"Seseorang ada di atas agama temannya, maka hendaknya salah seorang kalian meneliti siapa yang dijadikan sebagai temannya.\" (HR Ahmad dan Abu Dawud) " +
                "\n " +
                "2. Menjaga Kerukunan " +
                "\n" +
                "Saat berteman, hendaknya kita menjaga kerukunan. Ini merupakan adab yang harus selalu dijaga oleh setiap muslim kepada temannya." +
                "\n" +
                "3. Mendahului Mengucapkan Salam" +
                "\n" +
                "Seorang teman tidak sungkan-sungkan untuk mendahului mengucapkan salam ketika bertemu. Mengucapkan salam bisa mendatangkan rasa sayang antar sesama teman. Rasulullah SAW bersabda,\n" +
                "\n" +
                "\"Maukan kalian aku tunjukkan suatu amalan yang bisa membuat kalian saling menyayangi? Sebarkanlah salam di antara kalian.\" (HR Muslim)",
    )

    val listAdab: ArrayList<AdabSunnahModel>
    get() {
        val list = arrayListOf<AdabSunnahModel>()
        for (data in DataAdabSunnahModel.titleAdab.indices) {
            val adab = AdabSunnahModel(
                DataAdabSunnahModel.titleAdab[data],
                DataAdabSunnahModel.contentAdab[data]
            )
            list.add(adab)
        }
        return list
    }

    private val titleSunnah = arrayOf(
        "Sunnah Jumat",
        "Sunnah Ketika Makan",
        "Sunnah Ketika Bertemu Teman"
    )

    private val contentSunnah = arrayOf(
        "Gunting Kuku dan perbuluan",
        "Pakai tangan",
        "Dahulukan salam"
    )

    val listSunnah: ArrayList<AdabSunnahModel>
        get() {
            val list = arrayListOf<AdabSunnahModel>()
            for (data in DataAdabSunnahModel.titleAdab.indices) {
                val sunnah = AdabSunnahModel(
                    DataAdabSunnahModel.titleSunnah[data],
                    DataAdabSunnahModel.contentSunnah[data]
                )
                list.add(sunnah)
            }
            return list
        }


}