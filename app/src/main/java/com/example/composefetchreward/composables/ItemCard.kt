package com.example.composefetchreward.composables

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.composefetchreward.model.Item

@Composable
fun ItemCard(item: Item) {
    Card(
        modifier = Modifier.padding(4.dp),
        shape = RoundedCornerShape(8.dp), elevation = 4.dp
    ) {
        Surface {
            Column(modifier = Modifier.shadow(4.dp).padding(10.dp)) {
                Row(
                    Modifier
                        .padding(4.dp)
                        .fillMaxWidth()
                ) {
                    Text(text = "List ID: " + item.listId, fontWeight = FontWeight.Bold)
                    Text(text = "ID: " + item.id, fontWeight = FontWeight.Bold)
                }
                Row(
                    Modifier
                        .padding(4.dp)
                        .fillMaxWidth()
                ) {
                    Text(text = "Name: " + item.name, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}

