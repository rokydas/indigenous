@file:JvmName("HomeScreenKt")

package com.example.medi_sheba.presentation.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.Image

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun HomeScreen(navController: NavController, auth: FirebaseAuth) {

//    val profileController = ProfileController()
//    val user = profileController.user.observeAsState()
//    profileController.getUser(auth.currentUser!!.uid)

    val categoryList = listOf (
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
        modifier = Modifier.background(Color(0xFFf1faff))
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    "Indigenous\ne-learning",
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 30.sp)
                )
                Spacer(modifier = Modifier.height(20.dp))
//                Row(
//                    horizontalArrangement = Arrangement.SpaceAround
//                ) {
//                    Box(
//                        modifier = Modifier
//                            .padding(horizontal = 20.dp, vertical = 10.dp)
//                            .shadow(5.dp, shape = RoundedCornerShape(10.dp))
//                            .background(Color.White)
//                            .padding(vertical = 15.dp, horizontal = 25.dp)
//                            .clickable {
//                                navController.currentBackStackEntry?.savedStateHandle?.set("indigenous", "chakma")
//                                navController.navigate(ScreenItem.IndigenousScreenItem.route)
//                            },
//                        contentAlignment = Alignment.Center
//                    ) {
//                        Text(text = "Chakma", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp))
//                    }
//                    Box(
//                        modifier = Modifier
//                            .padding(horizontal = 20.dp, vertical = 10.dp)
//                            .shadow(5.dp, shape = RoundedCornerShape(10.dp))
//                            .background(Color.White)
//                            .padding(vertical = 15.dp, horizontal = 25.dp)
//                            .clickable {
//                                navController.currentBackStackEntry?.savedStateHandle?.set("indigenous", "marma")
//                                navController.navigate(ScreenItem.IndigenousScreenItem.route)
//                            },
//                        contentAlignment = Alignment.Center
//                    ) {
//                        Text(text = "Marma", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp))
//                    }
//                }
//                Spacer(modifier = Modifier.height(20.dp))
//                Row(
//                    horizontalArrangement = Arrangement.SpaceAround
//                ) {
//                    Box(
//                        modifier = Modifier
//                            .padding(horizontal = 20.dp, vertical = 10.dp)
//                            .shadow(5.dp, shape = RoundedCornerShape(10.dp))
//                            .background(Color.White)
//                            .padding(vertical = 15.dp, horizontal = 25.dp)
//                            .clickable {
//                                navController.currentBackStackEntry?.savedStateHandle?.set("indigenous", "tripura")
//                                navController.navigate(ScreenItem.IndigenousScreenItem.route)
//                            },
//                        contentAlignment = Alignment.Center
//                    ) {
//                        Text(text = "Tripura", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp))
//                    }
//                    Box(
//                        modifier = Modifier
//                            .padding(horizontal = 20.dp, vertical = 10.dp)
//                            .shadow(5.dp, shape = RoundedCornerShape(10.dp))
//                            .background(Color.White)
//                            .padding(vertical = 15.dp, horizontal = 25.dp)
//                            .clickable {
//                                navController.currentBackStackEntry?.savedStateHandle?.set("indigenous", "rakhaine")
//                                navController.navigate(ScreenItem.IndigenousScreenItem.route)
//                            },
//                        contentAlignment = Alignment.Center
//                    ) {
//                        Text(text = "Rakhaine", style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 20.sp))
//                    }
//                }
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
                                navController.currentBackStackEntry?.savedStateHandle?.set("indigenous", category.route)
                                navController.navigate(ScreenItem.IndigenousScreenItem.route)
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

