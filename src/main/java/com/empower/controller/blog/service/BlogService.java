// package com.empower.controller.blog.service;

// import com.empower.controller.blog.Blog;
// import com.empower.utils.cloudinary.UploadImage;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import org.springframework.web.multipart.MultipartFile;

// import java.io.File;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.util.List;
// import java.util.Map;
// import java.util.Optional;

// @Service
// public class BlogService {

//     @Autowired
//     private BlogRepository blogRepository;

//     @Autowired
//     private UploadImage uploadImage;

//     // Create or Update Blog
//     public Blog createOrUpdateBlog(Blog blog, MultipartFile[] images) {
//         try {
//             // Handle image uploads
//             if (images != null && images.length > 0) {
//                 String[] uploadedImageUrls = new String[images.length];
//                 for (int i = 0; i < images.length; i++) {
//                     File convFile = convertMultiPartToFile(images[i]);
//                     Map<String, Object> uploadResult = uploadImage.uploadImage(convFile.getAbsolutePath());
//                     uploadedImageUrls[i] = (String) uploadResult.get("url");  // Get image URL from the Cloudinary response
//                     convFile.delete(); // Delete temporary file after uploading
//                 }
//                 blog.setImages(uploadedImageUrls);
//             }
//             return blogRepository.save(blog);
//         } catch (IOException e) {
//             e.printStackTrace();
//             return null;
//         }
//     }

//     // Get Blog by ID
//     public Optional<Blog> getBlogById(Long id) {
//         return blogRepository.findById(id);
//     }

//     // Get All Blogs
//     public List<Blog> getAllBlogs() {
//         return blogRepository.findAll();
//     }

//     // Delete Blog by ID
//     public boolean deleteBlog(Long id) {
//         if (blogRepository.existsById(id)) {
//             blogRepository.deleteById(id);
//             return true;
//         }
//         return false;
//     }

//     // Convert MultipartFile to File
//     private File convertMultiPartToFile(MultipartFile file) throws IOException {
//         File convFile = new File(file.getOriginalFilename());
//         FileOutputStream fos = new FileOutputStream(convFile);
//         fos.write(file.getBytes());
//         fos.close();
//         return convFile;
//     }
// }

