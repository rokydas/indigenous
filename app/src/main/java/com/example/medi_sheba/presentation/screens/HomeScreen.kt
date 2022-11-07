@file:JvmName("HomeScreenKt")

package com.example.medi_sheba.presentation.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.medi_sheba.model.Category
import com.example.medi_sheba.presentation.screenItem.ScreenItem
import com.example.medi_sheba.presentation.util.gridItems
import com.google.firebase.auth.FirebaseAuth
import com.example.medi_sheba.R

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun HomeScreen(navController: NavController, auth: FirebaseAuth) {

    val communityCategoryList = listOf (
        Category(1, "Chakma", R.drawable.chakma, "chakma"),
        Category(2, "Marma", R.drawable.marma, "marma"),
        Category(3, "Tangchangya", R.drawable.tangchangya, "tangchangya"),
        Category(4, "Tripura", R.drawable.tripura, "tripura")
    )

    val eLearningCategoryList = listOf (
        Category(1, "Chakma", R.drawable.chakma, "chakma"),
        Category(2, "Marma", R.drawable.marma, "marma"),
        Category(3, "Tangchangya", R.drawable.tangchangya, "tangchangya"),
        Category(4, "Tripura", R.drawable.tripura, "tripura")
    )

    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                navController = navController,
                title = "Home"
            )
        },
        modifier = Modifier.background(Color(0xFFB0D5E9)),
        topBar = {
            AppBar(navController = navController, title = "Home")
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                item {
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        "Indigenous Community",
                        style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 25.sp)
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                }
                gridItems(
                    data = communityCategoryList,
                    columnCount = 2,
                    modifier = Modifier
                ) { category ->
                    CategoryCard(
                        modifier = Modifier.clickable {
                            navController.currentBackStackEntry?.savedStateHandle?.set("indigenous", category.route)
                            navController.navigate(ScreenItem.IndigenousScreenItem.route)
                        },
                        name = category.name,
                        contentName = category.name,
                        painter = painterResource(category.image)
                    )
                }
                item {
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        "Indigenous e-learning",
                        style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 25.sp)
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                }
                gridItems(
                    data = eLearningCategoryList,
                    columnCount = 2,
                    modifier = Modifier
                ) { category ->
                    CategoryCard(
                        modifier = Modifier.clickable {
                            navController.currentBackStackEntry?.savedStateHandle?.set("e-learning", category.route)
                            navController.navigate(ScreenItem.ELearningScreenItem.route)
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

@Composable
fun CategoryCard(
    modifier: Modifier = Modifier,
    name: String,
    contentName: String,
    painter: Painter,
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(horizontal = 7.dp, vertical = 5.dp)
            .shadow(5.dp, RoundedCornerShape(10.dp))
            .background(Color.White)
            .padding(all = 5.dp)
    ) {
        Image(
            painter = painter,
            contentDescription = contentName,
            modifier = Modifier
                .width(90.dp)
                .padding(vertical = 10.dp)
        )
        Text(
            text = name,
            modifier = Modifier.padding(bottom = 5.dp),
            style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
        )
    }
}
