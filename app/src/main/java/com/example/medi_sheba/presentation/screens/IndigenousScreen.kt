package com.example.medi_sheba.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.medi_sheba.R
import com.example.medi_sheba.model.Category
import com.example.medi_sheba.presentation.screenItem.ScreenItem
import com.example.medi_sheba.presentation.util.gridItems
import com.google.firebase.auth.FirebaseAuth

@Composable
fun IndigenousScreen(navController: NavHostController, auth: FirebaseAuth, indigenous: String) {

    val categoryList = listOf(
        Category(1, "Alphabet", R.drawable.alphabet, "alphabet"),
        Category(2, "History", R.drawable.history, "history"),
        Category(3, "Cultural Activities", R.drawable.cultural, "cultural"),
        Category(4, "Literature", R.drawable.literature, "")
    )

    Scaffold(
        modifier = Modifier.background(Color(0xFFf1faff)),
        topBar = {
            AppBar(navController = navController, title = "Indigenous Community")
        }
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = indigenous.uppercase(),
                style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
            )

            Image(
                painter = painterResource(id = R.drawable.cover),
                contentDescription = "cover",
                modifier = Modifier
                    .padding(vertical = 10.dp)
            )

            LazyColumn(
                contentPadding = PaddingValues(10.dp),
                modifier = Modifier
                    .fillMaxSize()
            ) {
                gridItems(
                    data = categoryList,
                    columnCount = 2,
                    modifier = Modifier
                ) { category ->
                    CategoryCard(
                        modifier = Modifier.clickable {
                            if (category.route == "alphabet") {

                            } else if (category.route == "history") {
                                navController.navigate(ScreenItem.HistoryScreenItem.route)
                            } else if (category.route == "cultural") {
                                navController.navigate(ScreenItem.CulturalActivitiesItem.route)
                            }
                        },
                        name = category.name,
                        contentName = category.name,
                        painter = painterResource(category.image)
                    )
                }
            }

        }
    }
}