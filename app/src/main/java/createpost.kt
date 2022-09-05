package com.example.social29

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.social29.daos.PostDao
import kotlinx.android.synthetic.main.createpost.*


class createpost: AppCompatActivity()  {

        private lateinit var postDao: PostDao

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.createpost)

            postDao = PostDao()

            postButton.setOnClickListener {
                val input = postInput.text.toString().trim()
                if(input.isNotEmpty()) {
                    postDao.addPost(input)
                    finish()
                }
            }

            setUpRecyclerView()
        }

        private fun setUpRecyclerView() {

        }
    }
