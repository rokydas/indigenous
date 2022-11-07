package com.example.medi_sheba.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun CulturalScreen(navController: NavHostController) {
    Scaffold(
        modifier = Modifier.background(Color(0xFFf1faff)),
        topBar = {
            AppBar(navController = navController, title = "Cultural")
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
                text = "চাকমাদের সংস্কৃতি",
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "মধ্যযুগে চাকমা জনগোষ্ঠী",
                style = TextStyle(fontWeight = FontWeight.Bold)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "বেশির ভাগ চাকমা শত শত বছরের পুরাতন থেরবাদী বৌদ্ধ ধর্ম অনুসরণ করে। তাদের বৌদ্ধ ধর্ম পালনের মধ্যে হিন্দুধর্ম ও অন্যান্য প্রাচীন ধর্মের মিল পাওয়া যায়।\n" +
                        "প্রায় প্রত্যেক চাকমা গ্রামের বৌদ্ধ মন্দির বা হিয়ং আছে। বৌদ্ধ সন্যাসীদের ভান্তে বলা হয়। তারা ধর্মীয় উৎসব ও অনুষ্ঠান তত্ত্বাবধায়ন করে। গ্রামবাসীরা ভিক্ষুদের খাবার, উপহার, ইত্যাদি দিয়ে সাহায্য করে।\n" +
                        "চাকমারা হিন্দু দেব-দেবীর পূজাও করে থাকে। উদাহরণস্বরূপ, লক্ষীদেবীকে চাষাবাদের দেবী হিসেবে পূজা করা হয়। চাকমার বিশ্বাস করে কিছু আত্মা পৃথিবীতে জ্বর ও রোগব্যাধি নিয়ে আসে এবং এসব আত্মাদের সন্তুষ্ট রাখার জন্য এরা ছাগল, মুরগী, হাঁস, ইত্যাদি বলি দেয়। যদিও বৌদ্ধ বিশ্বাসমতে পশুবলি সর্ম্পূণ নিষিদ্ধ, সাধারণত বৌদ্ধ ভিক্ষুকরা এসব মানেন না।\n"
            )
        }
    }
}