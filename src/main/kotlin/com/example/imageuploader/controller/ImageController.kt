package com.example.imageuploader.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class ImageController {
  @GetMapping("/upload")
  fun image(
    @ModelAttribute @Validated imageResponse: ImageResponse,
    model: Model
  ): String {
    model.addAttribute("imageResponse", imageResponse)
    return "image-uploader"
  }

  @PostMapping("/upload")
  fun upload(
    @ModelAttribute @Validated imageResponse: ImageResponse,
    model: Model
  ): String {
    model.addAttribute("imageResponse", imageResponse)
    return "image-uploader"
  }
}