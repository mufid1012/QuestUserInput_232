package com.exmaple.userinput

import android.view.RoundedCorner
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource


@Composable
fun FormulirPendaftaran(modifier: Modifier) {
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var status by remember { mutableStateOf("") }

    val listGender = listOf("Laki-laki", "Perempuan")
    val listStatus = listOf("Janda", "Lajang", "Duda")

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFB388FF)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        //Header Ungu
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0xFF7E57C2))
                .padding(start = 24.dp, bottom = 10.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Text(
                text = "Formulir Pendaftaran",
                fontSize = 30.sp,
                fontWeight = FontWeight.Normal,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(25.dp))

        //main form
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = dimensionResource(id = R.dimen.padding_medium)),
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        ){
            Column(
                modifier = Modifier
                    .padding(all = dimensionResource(id = R.dimen.padding_medium)),
                verticalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                Text("NAMA LENGKAP", fontWeight = FontWeight.SemiBold)
                OutlinedTextField(
                    value = nama,
                    onValueChange = { nama = it },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = { Text("Isian nama lengkap") }
                )

                Text("JENIS KELAMIN", fontWeight = FontWeight.SemiBold)
                listGender.forEach { item ->
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = gender == item,
                            onClick = { gender = item }
                        )
                        Text(text = item)
                    }
                }

                Text("STATUS PERKAWINAN", fontWeight = FontWeight.SemiBold)
                listStatus.forEach { item ->
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = status == item,
                            onClick = { status = item }
                        )
                        Text(text = item)
                    }
                }

                Text("ALAMAT", fontWeight = FontWeight.SemiBold)
                OutlinedTextField(
                    value = alamat,
                    onValueChange = { alamat = it },
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = { Text("Alamat") }
                )

                Button(
                    onClick = { /* aksi tombol */ },
                    enabled = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                        .height(52.dp), // sedikit lebih tinggi biar proporsional
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF7E57C2)),
                    shape = RoundedCornerShape(50.dp) // radius besar
                ) {
                    Text(
                        text = stringResource(id = R.string.submit),
                        fontSize = 18.sp,
                        color = Color.White
            }
        }
    }
}