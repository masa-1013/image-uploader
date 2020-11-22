package com.example.imageuploader.controller

import org.springframework.web.multipart.MultipartFile

data class ImageResponse(
  val file: MultipartFile? = null
)