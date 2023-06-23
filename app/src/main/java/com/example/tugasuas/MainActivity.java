package com.example.tugasuas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<DataModel> mList;
    private ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.main_recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mList = new ArrayList<>();

        //DAFTAR ISI
        List<String> nestedList1 = new ArrayList<>();
        nestedList1.add("Daftar isi");
        nestedList1.add("Pengantar Fiqih Darah Wanita");
        nestedList1.add("BAB 1 : Pengertian Haid");
        nestedList1.add("A. Bahasa");
        nestedList1.add("B. Istilah");
        nestedList1.add("BAB 2 : Dalil Pensyariatan Terkait Haid");
        nestedList1.add("A. Al-Quran");
        nestedList1.add("B. As-Sunnah");
        nestedList1.add("BAB 3 : Pengertian Nifas");
        nestedList1.add("1. Bahasa");
        nestedList1.add("2. Istilah");
        nestedList1.add("a. Al-Hanafiyah dan Asy-Syafi'iyah");
        nestedList1.add("b. Al-Malikiyah");
        nestedList1.add("c. Al-Hanabilah");
        nestedList1.add("BAB 4 : Dalil Pensyariatan Terkait Nifas");
        nestedList1.add("BAB 5 : Pengertian Istihadhah");
        nestedList1.add("A. Bahasa");
        nestedList1.add("B. Istilah");
        nestedList1.add("1. Mazhab Al-Hanafiyah");
        nestedList1.add("2. Mazhab Asy-Syafi'iyah");
        nestedList1.add("3. Mazhab Al-Hanabilah");
        nestedList1.add("BAB 6 : Yang Termasuk Darah Istihadhah");
        nestedList1.add("1. Darah Sebelum Usia 9 Tahun");
        nestedList1.add("2. Darah Di Masa Suci");
        nestedList1.add("3. Darah Sebelum Melahirkan");
        nestedList1.add("4. Darah Melewati Durasi Maksimal Haid dan Nifas");
        nestedList1.add("BAB 7 : Dalil Pensyariatan Istihadhah");


        //List2 Pengantar Fiqih Darah Wanita
        List<String> nestedList2 = new ArrayList<>();
        nestedList2.add("Dalam ilmu Fiqih darah yang keluar dari kemaluan wanita ada tiga \n" +
                "macam: haid, nifas dan istihadhah. \n" +
                "Darah haid adalah darah yang keluar dari dalam rahim wanita secara \n" +
                "alami dalam keadaan sehat. Artinya bukan darah karena penyakit dan juga \n" +
                "karena melahirkan.\n" +
                "Darah nifas adalah darah yang keluar setelah melahirkan. Darah yang \n" +
                "keluar sebelum waktu melahirkan tidak dikatakan sebagai nifas. \n" +
                "Darah istihadhah adalah darah yang keluar dari rahim wanita melalui \n" +
                "kemaluannya dimana darah tersebut tidak memenuhi ciri-ciri haid ataupun \n" +
                "nifas");

        //List3 BAB 1 : Pengertian Haid
        List<String> nestedList3 = new ArrayList<>();
        nestedList3.add("A. Bahasa\n" +
                "Kata haidh (الحيض (dalam bahasa Arab berasal dari kata dasarnya haadha \n" +
                "(حاض (yang berarti : mengalir. \n" +
                "Dan makna haadhal wadhi (الوادي حاض (adalah bila air mengalir pada suatu \n" +
                "wadi atau lembah. Dan bila disebutkan haadha al-mar'atu (المرأة حاض (\n" +
                "maknanya menjadi : wanita itu darahnya mengalir.\n" +
                "Wanita yang sedang mengalami haidh disebut dengan haa-idh (حائض(. \n" +
                "Walaupun biasanya untuk yang berjenis kelamin wanita ditambahkan ta' \n" +
                "ta'nits, namun karena hanya perempuan saja yang bisa mengalaminya, maka \n" +
                "cukup disebut haa-idh saja dan tidak perlu disebut dengan haa-idhah (حائضة(. \n" +
                "Bila jumlah wanita yang mendapat haidh itu banyak, disebut dengan \n" +
                ".(حوائض) hawaidh dan ) ُحيَّض) hu");
        nestedList3.add("B. Istilah \n" +
                "Al-Khatib As-Syirbini mendefinisikan haid sebagai: \n" +
                "أوقَا ٍت\n" +
                "ِري َسبَ ٍب ِِف َ\n" +
                "مِن غَ\n" +
                "ةحةِ\n" +
                " صِ\n" +
                "ََل َسِبيل ال\n" +
                "ُوِغهَا عَ\n" +
                "ُل\n" +
                "َعَد ب\n" +
                "ب\n" +
                "أةِ\n" +
                "َ\n" +
                "ر\n" +
                "َ\n" +
                "امل\n" +
                "ِ\n" +
                "ِحم\n" +
                "َ\n" +
                "أق ََص ر\n" +
                "َ\n" +
                "ُ ُج مِن\n" +
                "ةٍَّل ََير\n" +
                "َدُم ِجِب\n" +
                "ُوَمةٍ\n" +
                "َمعل\n" +
                "Darah yang keluar dari ujung rahim seorang wanita setelah baligh karena \n" +
                "keadaannya yang sehat tanpa penyebab tertentu dan keluar pada jadwal \n" +
                "waktu yang sudah dikenal1\n" +
                ".");

        //List4 BAB 2 : Dalil Pensyariatan Terkait Haid
        List<String> nestedList4 = new ArrayList<>();
        nestedList4.add("A. Al-Quran\n" +
                "Di dalam Al-Quran Al-Karim dijelaskan tentang masalah haid ini dan \n" +
                "bagaimana menyikapinya. \n" +
                "ونَ َك َعِن\n" +
                "ُ\n" +
                "َل\n" +
                "يَسأ\n" +
                "َ و َل َ\n" +
                "َ ِحي ِض و\n" +
                "َساء ِِف امل\n" +
                "وا الن ِ\n" +
                "ُ\n" +
                "أًذى فَاعََتِل\n" +
                "َ\n" +
                "َ\n" +
                "َ ِحي ِض قُل ُهو\n" +
                "َذ امل ا\n" +
                "ِ\n" +
                "َطهُرَن فَا\n" +
                "ي\n" +
                "ُوُهةن َحةَّتَ\n" +
                "ب\n" +
                "َ\n" +
                "تَقر\n" +
                "ب ي ُث تَ َطهةرَن فَأ تُوُهةن مِن َح\n" +
                "ُُِي ُّ\n" +
                "َ\n" +
                "َني و\n" +
                "اِب\n" +
                "ة\n" +
                "ب التةو\n" +
                "ةن ا َّلل ُُِي ُّ\n" +
                "ِ\n" +
                "ا ُّلل ا\n" +
                "َُكُُ\n" +
                "أَمر\n" +
                "َ\n" +
                "َن\n" +
                "َطه ِ ِري\n" +
                "تَ\n" +
                "ُ\n" +
                "امل\n" +
                "‘Mereka bertanya kepadamu tentang haidh. Katakanlah: ‘Haidh itu \n" +
                "adalah suatu kotoran’. Oleh sebab itu hendaklah kamu menjauhkan diri \n" +
                "dari wanita di waktu haidh; dan janganlah kamu mendekati mereka \n" +
                "sebelum mereka suci . Apabila mereka telah suci maka campurilah mereka \n" +
                "itu di tempat yang diperintahkan Allah kepadamu. Sesungguhnya Allah \n" +
                "menyukai orang-orang yang bertaubat dan menyukai orang-orang yang \n" +
                "mensucikan diri.(QS. Al-Baqarah : 222) \n" +
                "Turunnya ayat ini dilatarbelakangi oleh kejadian di masa itu, dimana istri\u0002istri orang Yahudi diasingkan oleh suaminya selama haid. Mereka tidak \n" +
                "diperkenankan makan dan minum bersama, bahkan tinggal serumah dengan \n" +
                "suaminya pun tidak boleh.\n" +
                "Oleh karena itu, para shahabat bertanya pada Rasulullah SAW apakah \n" +
                "mereka juga harus melakukan hal yang sama pada istri-istri mereka \n" +
                "sebagaimana perlakuan orang-orang Yahudi terhadap istri-istrinya. Maka, \n" +
                "turunlah QS. Al-Baqarah ayat 222 sebagai jawabannya. Kemudian Rasulullah \n" +
                "SAW mempertegas dalam sabdanya:\n" +
                "ََك َح\n" +
                " \n" +
                "النِ\n" +
                "لة\n" +
                "ِ\n" +
                "ا\n" +
                "َُعوا ُ ةُك ََشءٍ\n" +
                "ا ْصن\n" +
                "\"Lakukan segala yang kau mau (terhadap istrimu yang haid) kecuali \n" +
                "berhubungan badan.\" (HR Muslim).");
        nestedList4.add("2. As-Sunnah\n" +
                "Terkait percakapan antara Nabi dan para shahabat diatas, tercantum \n" +
                "dalam hadits sebagai berikut:\n" +
                "ُّ\n" +
                "َُؤأِ ُِكوَها، فَقَا َل النةِب\n" +
                "ي\n" +
                "ْ\n" +
                "م\n" +
                "َ\n" +
                "ل\n" +
                "ْ\n" +
                "َِْيم\n" +
                "أُة فِ\n" +
                "َ\n" +
                "ْر\n" +
                "َ\n" +
                "َحا َض ِت امل\n" +
                "ذا\n" +
                "ِ\n" +
                "ةن الََيُوَد ََكنت ا\n" +
                "أ\n" +
                "َ\n" +
                "أنٍَس ر َيض ُهللا َعْنُه\n" +
                "َ\n" +
                "َع ْن\n" +
                "َ\n" +
                "و صَل \n" +
                "ْس\n" +
                "ُه ُم\n" +
                "َوا\n" +
                "َر\n" +
                "ََك َح،\n" +
                " \n" +
                "النِ\n" +
                "هللا عليه وسمل : لة\n" +
                "ِ\n" +
                "ا\n" +
                "ِمل ا ْصن م َُعوا ُ ةُك ََشءٍ\n" +
                "Dari Anas RA bahwa orang yahudi bila para wanita mereka sedang \n" +
                "mendapat haidh, mereka tidak memberikan makanan pada para wanita \n" +
                "itu. Rasulullah SAW bersabda, \"Lakukan segala yang kau mau kecuali \n" +
                "nikah (hubungan badan).\" (HR Muslim).\n" +
                "Berkaitan dengan haid ini, Rasulullah SAW juga bersabda:\n" +
                "ةن\n" +
                " أم ه مر ا هذا\n" +
                "َ\n" +
                "تب\n" +
                "أ دَم ك ُهللا عَل بنا ِت َ\n" +
                "”Haid adalah sesuatu yang telah ditetapkan oleh Allah kepada anak-anak \n" +
                "wanita Nabi Adam” (HR. Bukhari Muslim)");

        //List5 BAB 3 : Pengertian Nifas
        List<String> nestedList5 = new ArrayList<>();
        nestedList5.add("1. Bahasa\n" +
                "Secara bahasa, kata nifas (نفاس (itu artinya adalah melahirkan, yaitu \n" +
                "seorang wanita yang hamil dan melahirkan bayi. Dikatakan :\n" +
                "َضَعت\n" +
                "َ\n" +
                "َذا و\n" +
                "ِ\n" +
                "ا\n" +
                "أةِ\n" +
                "َ\n" +
                "ر\n" +
                "َ\n" +
                "ِو َلَدُة امل\n" +
                "Nifas adalah kelahiran dari wanita yang melahirkan anak\n" +
                "Di dalam sebuah hadits Muslim, kata nifas pernah digunakan dalm arti \n" +
                "melahirkan anak.\n" +
                "َكٍر\n" +
                "أِِب ب\n" +
                "َ\n" +
                "ِن\n" +
                "ِد ب\n" +
                "ة\n" +
                "ُ َحم\n" +
                "َستِبم\n" +
                "ِبن َت َُُعي ٍس نُفِ\n" +
                "َ\n" +
                "أ َمساء\n" +
                "َ\n" +
                "ةن\n" +
                "أ\n" +
                "َ\n" +
                "Dari Aisyah radhiyallahanha bahwa Asma' binti Umais bernifas \n" +
                "(melahirkan) Muhammad bin Abi Bakr (HR. Muslim)\n" +
                "لة\n" +
                "ِ\n" +
                "ا\n" +
                "َما م َن ِن نَف ٍس َمنُفوَسةٍ\n" +
                "َب َم ََكُُنَا مِ\n" +
                "تِ\n" +
                "َ ك النةاِر ُ\n" +
                "و\n" +
                "اجلَنةةِ\n" +
                "Tidaklah ada seorang anak yang dinifas (dilahirkan) kecuali telah \n" +
                "dituliskan kedudukannya, di surga atau di neraka. (HR. Bukhari dan \n" +
                "Muslim)\n");
        nestedList5.add("2. Istilah\n" +
                "Sedangkan secara istilah, meski banyak kemiripan, namun para ulama \n" +
                "punya definisi yang agak berbeda, sesuai dengan hukum-hukum nifas yang \n" +
                "mereka tetapkan.");
        nestedList5.add("a. Al-Hanafiyah dan Asy-Syafi'iyah \n" +
                "Mazhab Al-Hanafiyah dan mazhab Asy-Syafi'iyah mendefinisikan nifas \n" +
                "sebagai : \n" +
                "َب ال ِو َلَدةِ\n" +
                "ي\n" +
                "ا ةدلُم اخلَاِرُج َعقِ\n" +
                "Darah yang keluar seusai melahirkan \n" +
                "Al-Khatib As-Syirbini mendefinisikan nifas sebagai :\n" +
                "ادلم اخلارج بعد فراغ الرح من امحلل\n" +
                "Darah yang keluar setelah rahin bersih dari kehamilan1\n" +
                "Asy-Syirbini menjelaskan bahwa nifas adalah darah yang terhitung \n" +
                "1 Mughnil Muhtaj, Juz 1 hlm 108\n" +
                "dimulai sejak berakhirnya kehamilan yang ditandai kosongnya rahim dari \n" +
                "janin. Baik yang keluar itu adalah bayi sempurna, atau bisa juga alaqah1\n" +
                "ataupun mudhghah2\n" +
                "yang sudah hampir membentuk khalqun adamiy3\n" +
                ". \n" +
                "Artinya, darah nifas itu dihitung setelah bayi (atau calon bayi keluar dari \n" +
                "rahim), bukan sebelumnya.\n");
        nestedList5.add("b. Al-Malikiyah \n" +
                "Mazhab Al-Malikiyah mendefinisikan nifas lebih spesifik, yaitu : \n" +
                "ََل\n" +
                "عَ\n" +
                "ِ لجل ال ِو َلَدةِ\n" +
                "َن الَفرجِ\n" +
                "ََل ا ةدل قَول ُم اخلَاِرُج مِ\n" +
                "أو َمَعهَا عَ\n" +
                "َفاقًا َ\n" +
                "ِ\n" +
                "َعَدَها ات \n" +
                "ب\n" +
                "َعاَدةِ\n" +
                "ال\n" +
                "َ\n" +
                "و\n" +
                "ةحةِ\n" +
                " صِ\n" +
                "ال\n" +
                "ِِجَةِ\n" +
                "1 Segumpal darah, bakal janin sebelum menjadi jaringan modiga.\n" +
                "2 Fase bakal janin setelah membentuk jaringan\n" +
                "3 Sudah terlihat bentuk jaringan seperti manusia\n" +
                "ِح .\n" +
                "ا ِج\n" +
                "ة\n" +
                "ََل الر\n" +
                "هَا عَ\n" +
                "َ\n" +
                "َل قَبل\n" +
                "كََثِ\n" +
                "ال \n" +
                "Darah yang keluar dari kemaluan seorang wanita karena sebab \n" +
                "melahirkan dengan normal dan sehat, dimana darah itu keluar bersama \n" +
                "bayi dan sesudahnya, tetapi bukan darah yang keluar sebelum bayi itu \n" +
                "lahir.\n");
        nestedList5.add("c. Al-Hanabilah \n" +
                "Al-Hanabilah menyebutkan bahwa definisi nifas adalah :\n" +
                "َعَدَها\n" +
                "ب\n" +
                "َ\n" +
                "ٍ و\n" +
                "َ َجع\n" +
                "كَو\n" +
                "ةٍ\n" +
                "َ\n" +
                "أَمار\n" +
                "َ\n" +
                "َع\n" +
                "أو ثَ َال ٍث َم\n" +
                "َ\n" +
                "َوَم ِني\n" +
                "هَا ِبي\n" +
                "َ\n" +
                "قَبل\n" +
                "َ\n" +
                "َع ال ِو َلَدةِ و\n" +
                "َم\n" +
                "ُ\n" +
                "ِحم\n" +
                "ة\n" +
                "الر\n" +
                "َ َدمم تُرِخ وًما يهِ\n" +
                "َني ي\n" +
                "َعِ\n" +
                "أرب\n" +
                "َ\n" +
                "ِ\n" +
                "ام\n" +
                "َ\n" +
                "ََل تَم\n" +
                "ِ\n" +
                "ا\n" +
                "Darah yang keluar dari rahim bersama dengan kelahiran bayi, termasuk \n" +
                "yang keluar 2 atau 3 hari sebelum kelahiran, hingga hari ke-40 dari \n" +
                "kelahiran.\n" +
                "Dari beberapa definisi diatas, dapat kita simpulkan 3 batasan yang \n" +
                "berbeda terkait dimulainya darah nifas. Madzhab Hanafi dan Syafii \n" +
                "menghitung nifas setelah janin lahir. Madzhab Maliki menghitungnya \n" +
                "bersamaan dengan keluarnya janin atau setelahnya. Dan madzhab hambali \n" +
                "menghitung nifas paling cepat 2 atau 3 hari menjelang kelahiran janin, \n" +
                "dimana darah tersebut disertai sakit akibat kontraksi persalinan.\n");

        //BAB 4 : Dalil Pensyariatan Terkait Nifas
        List<String> nestedList6 = new ArrayList<>();
        nestedList6.add("Dari Ummu Salamah diriwayatkan :\n" +
                "عن أم سلمة قالت : َكنت النفساء جتلس عَل عهد رسول هللا صَل هللا عليه وسمل أربعني \n" +
                "ً\n" +
                "يوما\n" +
                "Wanita nifas di masa Rasulullah SAW menjalaninya selama 40 hari.\n" +
                "Abu Isa mengatakan : “Hadits ini berstatus sebagai hadits gharib, kami \n" +
                "tidak mengetahuinya kecuali dai Abi Sahl dari Massah al-Azdiyah dari Ummu \n" +
                "Salamah”\n" +
                "Para ahli fiqih sepakat bahwa wanita yang sedang nifas boleh \n" +
                "meninggalkan shalat selama nifas sampai 40 hari, kecuali jika mereka \n" +
                "mendapati darahnya berhenti sebelum 40 hari. Bila darahnya masih keluar \n" +
                "setelah 40 hari, para ulama mengatakan ia tak boleh meninggalkan shalat \n" +
                "lebih dari 40 hari. Diriwayatkan dari Hasan Al-Bashri bahwa seorang wanita \n" +
                "yang masih keluar darah nifas sampai 50 hari tetap masih harus \n" +
                "meninggalkan shalat.1\n" +
                "Mengenai perbedaan pendapat para ulama berkaitan durasi maksimal \n" +
                "nifas, akan Penulis jelaskan lebih lengkap di bab berikutnya insya Allah.\n");
        nestedList6.add("Dari Ummu Salamah diriwayatkan :\n" +
                "عن أم سلمة قالت : َكنت النفساء جتلس عَل عهد رسول هللا صَل هللا عليه وسمل أربعني \n" +
                "ً\n" +
                "يوما\n" +
                "Wanita nifas di masa Rasulullah SAW menjalaninya selama 40 hari.\n" +
                "Abu Isa mengatakan : “Hadits ini berstatus sebagai hadits gharib, kami \n" +
                "tidak mengetahuinya kecuali dai Abi Sahl dari Massah al-Azdiyah dari Ummu \n" +
                "Salamah”\n" +
                "Para ahli fiqih sepakat bahwa wanita yang sedang nifas boleh \n" +
                "meninggalkan shalat selama nifas sampai 40 hari, kecuali jika mereka \n" +
                "mendapati darahnya berhenti sebelum 40 hari. Bila darahnya masih keluar \n" +
                "setelah 40 hari, para ulama mengatakan ia tak boleh meninggalkan shalat \n" +
                "lebih dari 40 hari. Diriwayatkan dari Hasan Al-Bashri bahwa seorang wanita \n" +
                "yang masih keluar darah nifas sampai 50 hari tetap masih harus \n" +
                "meninggalkan shalat.1\n" +
                "Mengenai perbedaan pendapat para ulama berkaitan durasi maksimal \n" +
                "nifas, akan Penulis jelaskan lebih lengkap di bab berikutnya insya Allah.\n");

        //BAB 5 : Pengertian Istihadhah
        List<String> nestedList7 = new ArrayList<>();
        nestedList7.add("A. Bahasa\n" +
                "Secara bahasa, kata istihadhah adalah mashdar yang berasal dari kata \n" +
                " Seorang .)اس تحاض - يس تحيض - اس تحاضة) istihadhah - yastahidhu - istahadha\n" +
                "wanita yang mengalami istihadhah disebut dengan mustahadhah, yaitu :\n" +
                "َمن يل\n" +
                "ِ\n" +
                "َل َدُم يَس هَا\n" +
                "َ\n" +
                " \n" +
                "ِري ُ و رقَأ\n" +
                "ي ِِف غَ\n" +
                "ٍ\n" +
                "ةَّيم\n" +
                "أ\n" +
                "َ\n" +
                "ُوَمةٍ\n" +
                "َمعل\n" +
                "Wanita yang darahnya mengalir tidak terbendung dan keluar di selain \n" +
                "hari-hari yang biasa ia ketahui");
        nestedList7.add("B. Istilah\n" +
                "Para ulama mendefinisikan istihadah sebagai keluarnya darah dari \n" +
                "kemaluan wanita di luar haidh dan nifas atau karena sakit. Selengkapnya \n" +
                "sebagai berikut:");
        nestedList7.add("1. Mazhab Al-Hanafiyah \n" +
                "Mewakili mazhab Al-Hanafiyah, di dalam kitab Maraqi Al-Falah \n" +
                "disebutkan bahwa darah istihadhah adalah :\n" +
                "1\n" +
                "ِع َد رٍق ُم\n" +
                "َ\n" +
                "َجر\n" +
                "َس انَف\n" +
                "ي\n" +
                "َ\n" +
                "َن ل\n" +
                "ِ مِ\n" +
                "ِحم\n" +
                "ة\n" +
                "الر\n" +
                "Darah kotor yang memancar keluar dari selain rahim.\n");
        nestedList7.add("2. Mazhab Asy-Syafi’iyah \n" +
                "Sedangkan mazhab Asy-Syafi’iyah mendefinisikan darah istihadhah\n" +
                "sebagai :\n" +
                "ع يل ِ ةٍَّل َدُم\n" +
                "يَس ن ِ\n" +
                "أدَن ِع ِن م رٍق ِ\n" +
                "ِ م َ\n" +
                "ِحم\n" +
                "ة\n" +
                "الر\n" +
                "Darah penyakit yang mengalir dari rahim bagian bawah");
        nestedList7.add("3. Mazhab Al-Hanabilah\n" +
                "Al-Buhuti di dalam kitab Kasysyaf Al-Qinna' menyebutkan tentang \n" +
                "pengertian istihadhah ini : 1\n" +
                "َحا َضُة\n" +
                "َ و الُن َالاس تِ\n" +
                "َ ي\n" +
                "أدَن \n" +
                "ُمُه ِِف َ\n" +
                "من ِعرٍق فَ\n" +
                "ٍد ِ\n" +
                "َسا\n" +
                "َوفَ\n" +
                "َرٍض \n" +
                "من ) َم\n" +
                "ة ِ\n" +
                "عتَاَدِ\n" +
                "ُ\n" +
                "ه ( امل\n" +
                "ِ ِ\n" +
                "أوقَات\n" +
                "ِري َ\n" +
                "س ا ةدلِم ِِف غَ\n" +
                "1 Al-Buhuti, Kasysyaf Al-Qinna', jilid 1 hal. 177\n" +
                "ِ\n" +
                "ِحم\n" +
                "ة\n" +
                "الر\n" +
                "Istihadhah adalah mengalirnya darah di luar waktu yang menjadi \n" +
                "kebiasaannya, bukan karena sakit atau kerusakan, berupa darah yang \n" +
                "mulutnya dari rahim bagian bawah.\n");

        //BAB 6 : Yang Termasuk Darah Istihadhah
        List<String> nestedList8 = new ArrayList<>();
        nestedList8.add("Dari pengertian diatas, kita ketahui bahwa darah yang keluar dari \n" +
                "kemaluan seorang wanita yang tidak memenuhi ciri dan sifat darah haid dan \n" +
                "nifas disebut darah istihadhah. \n" +
                "Kesimpulannya, darah istihadhah itu antara lain:");
        nestedList8.add("1. Darah Sebelum Usia 9 Tahun\n" +
                "Bila seorang anak perempuan yang mengalami keluar darah dari \n" +
                "kemaluannya seperti darah haidh, padahal usianya belum lagi masuk usia \n" +
                "haidh, yakni belum 9 tahun menurut hitungan tahun qamariyah, maka dia \n" +
                "bukan sedang mendapat haidh. Sebagian ulama madzhab Syafii mengatakan \n" +
                "setidak-tidaknya usia wanita tersebut adalah 9 tahun hijriyah kurang 16 hari");
        nestedList8.add("2. Darah di Masa Suci\n" +
                "Bila ada darah yang keluar sebelum durasi minimal masa suci (15 hari), \n" +
                "maka darah tersebut disebut sebagai istihadhah. Kasus ini disebut sebagai \n" +
                "al-mar’ah alaiha baqiyyatut thuhr, yakni wanita yang harus menggenapkan \n" +
                "durasi minial masa sucinya sebelum mendapat siklus baik berikutnya.\n" +
                "Misalnya, ia mengalami haid tanggal 1-7 dan suci dimulai pada tanggal 8. \n" +
                "Lalu darah keluar lagi tanggal 20 – 27 di bulan yang sama. Maka darah yang \n" +
                "keluar pada tanggal 20, 21 dan 22 adalah darah istihadhah, untuk \n" +
                "menggenapkan durasi masa suci 15 hari (tanggal 8-22). Kemudian tanggal \n" +
                "23-27 barulah dihukumi sebagai haid.\n");
        nestedList8.add("3. Darah sebelum melahirkan\n" +
                "Dalam madzhab Syafii darah nifas terhitung sejak janin keluar dari dalam \n" +
                "rahim. Maka, darah yang keluar sebelum janin kosong disebut istihadhah. \n" +
                "Bila sebelum kelahiran telah ada darah yang keluar, entah apa pun nama dan \n" +
                "istilahnya, disebut dengan darah istihadhah.");
        nestedList8.add("4. Darah Melewati Durasi Maksimal Haid dan Nifas\n" +
                "Bila seorang wanita keluar darah melewati durasi maksimal haid (lebih \n" +
                "dari 15 hari) atau melewati durasi maksimal nifas (lebih dari 60) maka ia \n" +
                "mengalami istihadhah. Kasus ini disebut ikhtalatha damul haid /nifas bil \n" +
                "istihadhah, yakni tercampurnya darah haid/nifas dengan istihahadah. \n" +
                "Dalam keadaan seperti ini, ia harus memilah manakah di antara hari-hari \n" +
                "itu yang termasuk darah haid/nifas dan mana yang termasuk istihadhah. \n" +
                "Tatacara memilah darah haid/nifas dengan istihadhah insya Allah akan kita \n" +
                "jelaskan dalam bab-bab berikutnya.\n");

        //BAB 6 : Yang Termasuk Darah Istihadhah
        List<String> nestedList9 = new ArrayList<>();
        nestedList9.add("Dalam satu hadits diceritakan percakapan antara Rasulullah SAW dengan \n" +
                "Fatimah Bint Abi Hubaisy terkait istihadhah yang dialaminya:\n" +
                " أ فاطمَة بن َت أِب يْ ٍش ةن\n" +
                "َ\n" +
                "ُح ت ب\n" +
                "َ\n" +
                "ِّلل صةَل ا ةُّلل \n" +
                "جاء رسوَل ا ة\n" +
                "يهِ\n" +
                "َ\n" +
                "وسةمل ت عل َ\n" +
                "َ\n" +
                "أس تَحا ُض \n" +
                " ن امر أمة \n" +
                "فقال اِ\n" +
                "فال \n" +
                "ُ\n" +
                "َس ت ِع قا انةام ذِ َل رمق َل ال ةص أطهر أفأ د ُع الَة\n" +
                "ولي \n" +
                "ِ\n" +
                "ةصالَة\n" +
                "َ ِت احلَيضُة فدَ عي ال\n" +
                "ابحلي َضة ف اذا أقبل\n" +
                "َ وا ت ذا\n" +
                " يل ِك فاغِس أدب يل َر\n" +
                "عن ا ةدلَم ةث صِ\n" +
                "Fatimah Bint Abi Hubaisy datang menemui Rasulullah SAW dan berkata : \n" +
                "‘Saya adalah wanita yang mengalami istihadhah, maka saya tidak bersuci. \n" +
                "Apakah saya harus meninggalkan shalat (selama istihadhah)?’. Rasulullah \n" +
                "SAW menjawab: ‘istihadhah itu dihukumi seperti keringat, bukan layaknya \n" +
                "haid. Bila yang datang itu adalah haid, maka baru tinggalkan shalat. Dan \n" +
                "bila haidnya sudah selesai, maka mandilah lalu shalatlah’. (HR. Abu \n" +
                "Dawud)\n" +
                "Dalam hadits lain yang juga dari Fatimah Bint Abi Hubaisy disebutkan:\n" +
                "عن فاطمة بنت أِب حبيش ) أُنا َكنت تس تحاض، فقاللها رسول هللا صلى الله عليه وسلم: اذا َكن دم احليض \n" +
                "ف انهدم أسوديعرف ذا َكن ال خر فتوضيئ ف امنا هو عرق\n" +
                " \n" +
                "فأ مسيك عن الصالة، وا\n" +
                "Dari Fatimah Bint Abi Hubaisy, bahwa ia mengalami istihadhah, lalu \n" +
                "Rasulullah SAW berkata kepadanya : ‘Bila yang keluar itu adalah darah \n" +
                "haid yang darahnya berwarna hitam dan dikenal, maka tinggalkanlah \n" +
                "shalat. Namun jika yang keluar itu adalah darah yang lain, maka \n" +
                "berwudhulah. Sebab itu dihukumi seperti keringat. (HR. An-Nasa’i)");


        mList.add(new DataModel(nestedList1, "Daftar Isi"));
        mList.add(new DataModel(nestedList2, "Pengantar Fiqih Darah Wanita"));
        mList.add(new DataModel(nestedList3, "BAB 1 : Pengertian Haid"));
        mList.add(new DataModel(nestedList4, "BAB 2 : Dalil Pensyariatan Terkait Haid"));
        mList.add(new DataModel(nestedList5, "BAB 3 : Pengertian Nifas"));
        mList.add(new DataModel(nestedList6, "BAB 4 : Dalil Pensyariatan Terkait Nifas"));
        mList.add(new DataModel(nestedList7, "BAB 5 : Pengertian Istihadhah"));
        mList.add(new DataModel(nestedList8, "BAB 6 : Yang Termasuk Darah Istihadhah"));
        mList.add(new DataModel(nestedList9, "BAB 7 : Dalil Pensyariatan Istihadhah"));


        adapter = new ItemAdapter(mList);
        recyclerView.setAdapter(adapter);

    }
}
