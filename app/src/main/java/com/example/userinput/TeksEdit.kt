package com.example.userinput

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiri(modifier : Modifier
){
    //variabel-variabel untuk mengingat nilai masukkan dari keyboard
    var textNama by remember() { mutableStateOf(value = "")}
    var textAlamat by remember { mutableStateOf(value = "")}
    var textJK by remember { mutableStateOf(value = "")}

    //variabel-variabel untuk menyimpan untuk menyimpan data yang diperoloh dari komponen
    var nama by remember {mutableStateOf(value = "")}
    var alamat by remember {mutableStateOf(value = "")}
    var jenis by remember {mutableStateOf(value = "") }

    val gender: List<String> = listOf("Laki-Laki", "Perempuan")

    Column(modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifer = Modifier.width(width = 250.dp),
            label = { Text(text = "Nama Lengkap") },
            onValueChange = {
                textNama = it
            }
        )
        Row {
            gender.farEach { item ->
                Row(modifier = Modifier.selectable(
                    selected = textJK == item,
                    onClick = {textJK = item }
                ), verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = TextJK == item,
                        onClick = {
                            textJK = item
                        })
                    Text(text = item)
                }
            }
        }
        OutlinedTextField()
    }



}