package com.nagma.mywishlistapp

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun AddEditDetailView(
    id: Long,
    viewModel: WishViewModel,
    navController: NavController
) {
    Scaffold(
        topBar = {
            AppBarView(title =
            if (id != 0L) stringResource(R.string.add_wish)
            else stringResource(R.string.update_wish)
        )
        }) {
        Column(modifier = Modifier
            .padding(it)
            .wrapContentSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
            ) {
            Spacer(modifier = Modifier.height(10.dp))

        }

        
    }

}

@Composable
fun WishTextField(
    value: String,
    onValueChanged: (String) -> Unit,
    label: String
) {
   OutlinedTextField(
       value = value,
       onValueChange = onValueChanged,
       label = { Text(text = label, color = Color.Black) },
       modifier = Modifier.fillMaxWidth(),
       keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
//       colors = TextFieldDefaults.outlinedTextFieldColors(
//           textColor = Color.Black,
//           focusedBorderColor = Color.Black,
//           unfocusedBorderColor = colorResource(id = R.color.black),
//           cursorColor = colorResource(id = R.color.black),
//           focusedLabelColor = colorResource(id = R.color.black),
//           unfocusedLabelColor = colorResource(id = R.color.black),
//
//       ),
   )
}

@Preview(showBackground = true)
@Composable
fun WishTestFieldPreview() {
    WishTextField(value = "description", onValueChanged = {}, label = "title" )
}