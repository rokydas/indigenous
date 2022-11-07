package com.example.medi_sheba.presentation.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.medi_sheba.R
import com.example.medi_sheba.presentation.util.gridItems

@Composable
fun HistoryScreen(navController: NavHostController) {
    Scaffold(
        modifier = Modifier.background(Color(0xFFf1faff)),
        topBar = {
            AppBar(navController = navController, title = "History")
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "চাকমা জাতিসত্তার ইতিহাস",
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "চাকমা শব্দটি সংস্কৃত শব্দ শক্তিমান থেকে আগত। বর্মী রাজত্বের শুরুর দিককার সময়ে বর্মী রাজারা এই চাকমা নামকরণের প্রচলন করেন। তখনকার সময়ে বর্মী রাজারা, চাকমাদের রাজার পরামর্শক, মন্ত্রী এবং পালি ভাষার বৌদ্ধধর্মের পাঠ অনুবাদকের কাজে নিয়োগ প্রদান করতেন। রাজা কর্তৃক সরাসরি নিয়োগকৃত হওয়াতে বর্মী রাজ দরবারে চাকমারা বেশ প্রভাবশালী ছিলেন। বার্মায় প্রচলিত চাকমাদের নাম সংক্ষেপ \"সাক\" শব্দটি সংস্কৃত শব্দ শক্তিমানের বিকৃত রুপ হিসেবে বিবেচনা করা হয়। এরই এক পর্যায়ে, জনগোষ্ঠীটির নাম \"সাকমা\" এবং পরবর্তীতে বর্তমান \"চাকমা\" নামটি গ্রহণযোগ্যতা পায়।")
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "মধ্যযুগে চাকমা জনগোষ্ঠী",
                style = TextStyle(fontWeight = FontWeight.Bold)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "১৫৪৬ সালে আরাকান রাজা মেং বেং বার্মার সাথে যুদ্ধে জড়িয়ে পরেন। যুদ্ধাবস্থায় \"সাক\" রাজা উত্তর দিক থেকে তৎকালীন আরাকান, অর্থাৎ আজকের কক্সবাজারের রামু আক্রমণ করে দখল করে নেন।")
            Spacer(modifier = Modifier.height(5.dp))
            Image(
                painter = painterResource(id = R.drawable.chakma),
                contentDescription = "cover",
                modifier = Modifier
                    .padding(vertical = 10.dp)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "তার কিছু সময় পর, মুঘলরা চাকমাদের কাছ থেকে চট্টগ্রামে ব্যবসা করার বিপরীতে খাজনা দাবি করতে থাকেন। এর ফলে মুঘলদের সাথে চাকমাদের বিরোধ শুরু হয়। চাকমা আর মুঘলদের সাথে যুদ্ধ হয়। এতে মুঘলরা পিছু হটতে বাধ্য হয়। মুঘলদের কাছ থেকে চাকমা রাজা দুইটি কামান জব্দ করেন। যার একটি কাপ্তাই হৃদে নিমজ্জিত অবস্থায় আছে এবং আরেকটি চাকমা রাজবাড়ির কাছে আছে।\n" +
                    "পরবর্তীতে ১৭১৩ সালে চাকমা এবং মুগলদের মাঝে শান্তি স্থাপিত হয় এবং একটি দৃঢ় সম্পর্কের ও সূত্রপাত ঘটায় এই শান্তি স্থাপন। তারপর থেকে মুঘল সাম্রাজ্য আর কখনোই চাকমাদের কে তাদের বশ্যতা স্বীকারে বাধ্য করে নি। মুঘলরা একইসাথে চাকমা রাজা সুখদেব রায় কে পুরষ্কৃত করেন। সুখদেব রায় নিজের নামে রাজধানী স্থাপন করেন, যা আজো সুখবিলাস নামে পরিচিত। সেখানে আজো পুরনো রাজবাড়ির ধ্বংসাবশেষ এবং অন্যান্য প্রাচীন স্থাপনা রয়েছে। পরবর্তীতে রাজানগরে রাজধানী স্থানান্তর করা হয়। বর্তমানে যা চট্টগ্রাম জেলায় রাঙ্গুনিয়া উপজেলার, রানীরহাটের রাজানগর হিসেবে পরিচিত।\n")
        }
    }
}