package com.exmaple.userinput

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun FormulirPendaftaran(modifier: Modifier) {
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }

    val listGender = listOf("Laki-laki", "Perempuan")
    val listStatus = listOf("Janda", "Lajang", "Duda")
}