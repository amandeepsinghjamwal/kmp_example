package org.example.project

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.AbsoluteRoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val nunito =
        FontFamily(font("Nunito", "nunito_regular.ttf", FontWeight.Normal, FontStyle.Normal))

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                modifier = Modifier.padding(end = 10.dp, bottom = 15.dp),
                elevation = FloatingActionButtonDefaults.elevation(20.dp),
                containerColor = Color(0xFF252525),
                content = {

                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = null,
                        tint = Color.White
                    )
                },
                shape = CircleShape,
                onClick = {})
        },
        topBar = {
            TopAppBar(
                modifier = Modifier.padding(top = 20.dp),
                title = {
                    Text(
                        "Notes",
                        fontFamily = nunito,
                        color = Color.White,
                        fontSize = 35.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(containerColor = Color(0xFF252525)),
                actions = {
                    Row(
                        modifier = Modifier.padding(end = 15.dp),
                        horizontalArrangement = Arrangement.spacedBy(20.dp)
                    ) {
                        Box(
                            modifier = Modifier.background(
                                color = Color.White.copy(alpha = .1f),
                                shape = AbsoluteRoundedCornerShape(10.dp)
                            )
                        ) {
                            Icon(
                                Icons.Default.Search,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.padding(10.dp).size(22.dp)
                            )
                        }
                        Box(
                            modifier = Modifier.background(
                                color = Color.White.copy(alpha = .2f),
                                shape = AbsoluteRoundedCornerShape(10.dp)
                            )
                        ) {
                            Icon(
                                Icons.Default.Info,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.padding(10.dp).size(22.dp)
                            )
                        }
                    }
                }
            )
        },
        containerColor = Color(0xFF252525)
    ) {

    }
}