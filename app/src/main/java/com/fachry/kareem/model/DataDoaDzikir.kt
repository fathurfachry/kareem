package com.fachry.kareem.model

object DataDoaDzikirModel {

    private val titleDoa = arrayOf(
        "Doa Sebelum Tidur",
        "Doa Bangun Tidur",
        "Doa Setelah Makan"
    )

    private val lafadzDoa = arrayOf(
        "بِسْمِكَ اللّهُمَّ اَحْيَا وَ بِسْمِكَ اَمُوْتُ",
        "اَلْحَمْدُ ِللهِ الَّذِى أَحْيَانَا بَعْدَمَا أَمَاتَنَا وَإِلَيْهِ النُّشُورُ",
        "اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ"
    )

    private val terjemahDoa = arrayOf(
        "Dengan nama-Mu, Ya Allah, aku hidup dan aku mati.",
        "Segala puji bagi Allah yang menghidupkan kami kembali setelah mematikan kami, dan kepada Allah kami dibangkitkan.",
        "Segala puji bagi Allah yang telah memberi kami makan dan telah memberi kami minum, dan menjadikan kami termasuk orang yang patuh."
    )

    val listDoa : ArrayList<DoaDzikirModel>
        get(){
            val list = arrayListOf<DoaDzikirModel>()
            for (position in titleDoa.indices) {
                val doa = DoaDzikirModel(
                    titleDoa[position],
                    lafadzDoa[position],
                    terjemahDoa[position]
                )
                list.add(doa)
            }

            return list
        }

    private val titleDzikir = arrayOf(
        "Tahlil",
        "Takbir",
        "Tahmid",
        "Tasbih",
        "Hauqolah",
        "Istighfar",
        "Shalawat"
    )


    private val lafazDzikir = arrayOf(
        "Pertama:\n لا إله إلا الله\nKedua:\nلَا إِلَـهَ إِلَّا اللهُ وَحْدَهُ لَا شَرِيْكَ لَهُلَهُ الْمُلْكُ وَلَهُ الْحَمْدُ وَهُوَ عَلَى كُلِّ شَيْءٍ قَدِيْرُ",
        "Umum:\nالله ُأَكبَرُ\nTakbir Hari Raya yang Diriwayatkan oleh\nJabir bin Abdillah:\nالله أكبر، الله أكبر، الله أكبر، لا إله إلا الله، والله أكبر، الله أكبر، ولله الحمد\nAbdullah bin Mas'ud:\nالله أكبر، الله أكبر، لا إله إلا الله، والله أكبر، الله أكبر، ولله الحمد\nIbnu Abbas:\nالله ُأَكبَرُ ، الله ُأَكبَرُ ، الله ُأَكبَرُ ، و للهِ الحَمدُ ، الله ُأَكبَرُ و أَجَلُّ ، الله ُأَكبَرُ عَلَى مَا هَدَانَا\nSalman:\nالله ُأَكبَرُ ، الله ُأَكبَرُ ، الله ُأَكبَرُ  كَبِيراً",
        "Pertama:\nالحمد لله\nKedua:\nالحمد لله رب العالمين\nKetiga:\nالحمد لله حمدا كثيرا طيبا مباركا فيه\nKeempat:\nربنا لك الحد\nKelima:\nاللهم ربنا لك الحمد",
        "Pertama:\nسُبْحَانَ اللهِ\nKedua:\nسُبْحَانَ رَبِّىَ الْعَظِيمِ\nKetiga:\nسُبُّوحٌ قُدُّوسٌ رَبُّ الْمَلاَئِكَةِ وَالرُّوحِ\nKeempat:\nسُبْحَانَ ذِي الجَبَرُوْتِ وَالملَكُوْتِ وَالكِبْرِيَاء ِوَالعَظَمَةِ\nKelima:\nسُبْحَانَ رَبِّىَ الأَعْلَ",
        "لاحول ولا قوة الا بالله",
        "Pertama:\nأَسْتَغْفِرُ اللهَ\nKedua:\nأَسْتَغْفِرُ اللهَ وَأَتُوبُ إِلَيْهِ\nKetiga:\nأَسْتَغْفِرُ اللَّهَ الْعَظِيمَ الَّذِي لَا إِلَهَ إِلَّا هُوَ الْحَيَّ الْقَيُّومَ وَأَتُوبُ إِلَيْه\nKeempat:\nرَبِّ اغْفِرْ لِى وَتُبْ عَلَىَّ إِنَّكَ أَنْتَ التَّوَّابُ الرَّحِيمُ",
        "اللَّهُّم صلِّ على محمدٍ وعلى آل محمد كما صلَّيْتَ على إبراهيم وعلى آل إبراهيم إنك حميد مجيد، اللَّهُّم بارِكْ على محمدٍ وعلى آل محمد كما باركتَ على إبراهيم وعلى آل إبراهيم إنك حميدٌ مجيد"
    )


    private val terjemahDzikir = arrayOf(
        "Pertama:\n\"Tidak ada ilah yang berhak disembah selain Allah semata.\"\n\nKedua:\n\"Tidak ada ilah yang berhak disembah selain Allah semata, tidak ada sekutu bagi-Nya. Milik Allah segala kerajaan dan pujian. Dia lah yang berkuasa atas segala sesuatu.\"",
        "Umum: \n\"Allah Maha Besar\"\n\nTakbir Hari Raya yang Diriwayatkan oleh\nJabir bin Abdillah:\n\"Allah Maha Besar, Allah Maha Besar, Allah Maha Besar, tidak ada ilah yang berhak disembah selain Allah, dan Allah Maha Besar, Allah Maha Besar dan segala puji bagi hanya Allah.\"\n\nAbdullah bin Mas'ud:\n\"Allah Maha Besar, Allah Maha Besar, tidak ada ilah yang berhak disembah selain Allah, dan Allah Maha Besar, Allah Maha Besar dan segala puji bagi hanya Allah.\"\n\nIbnu Abbas:\n\"Allah Maha Besar, Allah Maha Besar, Allah Maha Besar, dan Allah lah segala pujian, Allah Maha Besar dan Maha Mulia, Allah Maha Besar atas petunjuk yang diberikannya pada kita.\"\n\nSalman:\n\"Allah Maha Besar, Allah Maha Besar, Allah Maha Besar\"",
        "Pertama:\n\"Segala puji bagi Allah\"\n\nKedua:\n\"Segala puji bagi Allah, Tuhan seluruh alam.\"\n\nKetiga:\n\"Segala puji bagi Allah, pujian yang berlimpah, baik dan berkah.\"\n\nKeempat:\n\"Wahai Rabb kami, segala puji bagi-Mu.\"\n\nKelima:\n\"Ya Allah, Rabb kami, segala puji bagi-Mu.\"",
        "Pertama:\n\"Maha Suci Allah\"\n\nKedua:\n\"Maha Suci Allah Yang Maha Agung\"\n\nKetiga:\n\"Maha Suci Allah Rabb para Malaikat dan Ar Ruuh (Jibril)\"\n\nKeempat:\n\"Maha Suci Allah Yang mempunyai keperkasaan dan kerajaan (penuh) serta kesombongan dan keagungan\"\n\nKelima:\n\"Maha Suci Rabbku Yang Maha Tinggi\"",
        "\"Tidak ada daya dan upaya kecuali dengan pertolongan Allah\"",
        "Pertama:\n\"Aku memohon ampun kepada Allah\"\n\nKedua:\n\"Aku memohon maghiroh Allah dan aku bertaubat kepada-Nya\"\n\nKetiga:\n\"Aku memohon ampunan kepada Allah yang tidak ada sesembahan yang berhak disembah kecuali Dia, Yang Maha Hidup dan Maha Tegak dan aku bertaubat kepada-Nya\"\n\nKeempat:\n\"Ya Rabbku ampunilah aku dan bimbinglah aku untuk bertaubat (atau terimalah tabatku) sesungguhnya Engkau adalah Maha Penerima Taubat dan Maha Rahmat\"",
        "\"Ya Allah, semoga shalawat tercurah kepada Muhammad dan keluarga Muhammad sebagaimana tercurah pada Ibrahim dan keluarga Ibrahim, sesungguhnya Engkau Maha Terpuji lagi Maha Mulia. Ya Allah, semoga berkah tercurah kepada Muhammad dan keluarga Muhammad sebagaimana tercurah pada Ibrahim dan keluarga Ibrahim, sesungguhnya Engkau Maha Terpuji lagi Maha Mulia.\""
    )


    val listDzikir: ArrayList<DoaDzikirModel>
        get() {
            val list = arrayListOf<DoaDzikirModel>()
            for (data in titleDzikir.indices) {
                val dzikir = DoaDzikirModel(
                    titleDzikir[data],
                    lafazDzikir[data],
                    terjemahDzikir[data]
                )
                list.add(dzikir)
            }
            return list
        }

}