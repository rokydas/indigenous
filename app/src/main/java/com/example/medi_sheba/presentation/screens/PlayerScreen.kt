package com.example.medi_sheba.presentation.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun PlayerScreen(navController: NavHostController) {
    Scaffold(
        modifier = Modifier.background(Color(0xFFf1faff)),
        topBar = {
            AppBar(navController = navController, title = "Lecture")
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            val context = LocalContext.current
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier.background(Color.LightGray)
                    .padding(10.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/playlist?list=PLxgBE-0w-xcZrZEfwaOXNiz77lkUdvclt")) }
                Text(text = "Lec 1", modifier = Modifier.clickable {
                    context.startActivity(intent)
                })
            }
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier.background(Color.LightGray)
                    .padding(10.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/playlist?list=PLxgBE-0w-xcYVKHHS6IFKN6497IQ0iNep")) }
                Text(text = "Lec 2", modifier = Modifier.clickable {
                    context.startActivity(intent)
                })
            }
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier.background(Color.LightGray)
                    .padding(10.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/playlist?list=PLxgBE-0w-xcZr5EpNRdLgsi0s3SyMwowB")) }
                Text(text = "Lec 3", modifier = Modifier.clickable {
                    context.startActivity(intent)
                })
            }
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier.background(Color.LightGray)
                    .padding(10.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/playlist?list=PLxgBE-0w-xcYp9DZ8cYDf_BG_h7LiVsNQ")) }
                Text(text = "Lec 4", modifier = Modifier.clickable {
                    context.startActivity(intent)
                })
            }
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier.background(Color.LightGray)
                    .padding(10.dp)
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                val intent = remember { Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com/playlist?list=PLxChTq34dLH6VQAwKBEmj0GrYtIto83xq")) }
                Text(text = "Lec 5", modifier = Modifier.clickable {
                    context.startActivity(intent)
                })
            }


        }
    }
}