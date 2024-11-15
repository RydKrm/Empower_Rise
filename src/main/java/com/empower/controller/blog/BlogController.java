// package com.empower.controller.blog;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;
// import org.springframework.web.multipart.MultipartFile;

// import com.empower.controller.blog.service.BlogService;

// import java.util.List;
// import java.util.Optional;

// @RestController
// @RequestMapping("/api/v1/blogs")
// public class BlogController {

//     @Autowired
//     private BlogService blogService;

//     // Create or Update Blog
//     @PostMapping("/createOrUpdate")
//     public ResponseEntity<Blog> createOrUpdateBlog(@ModelAttribute Blog blog, @RequestParam("images") MultipartFile[] images) {
//         Blog savedBlog = blogService.createOrUpdateBlog(blog, images);
//         if (savedBlog != null) {
//             return new ResponseEntity<>(savedBlog, HttpStatus.CREATED);
//         }
//         return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//     }

//     // Get Blog by ID
//     @GetMapping("/{id}")
//     public ResponseEntity<Blog> getBlogById(@PathVariable Long id) {
//         Optional<Blog> blog = blogService.getBlogById(id);
//         return blog.map(ResponseEntity::ok).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//     }

//     // Get All Blogs
//     @GetMapping("/all")
//     public ResponseEntity<List<Blog>> getAllBlogs() {
//         List<Blog> blogs = blogService.getAllBlogs();
//         return new ResponseEntity<>(blogs, HttpStatus.OK);
//     }

//     // Delete Blog by ID
//     @DeleteMapping("/{id}")
//     public ResponseEntity<HttpStatus> deleteBlog(@PathVariable Long id) {
//         if (blogService.deleteBlog(id)) {
//             return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//         }
//         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//     }
// }

