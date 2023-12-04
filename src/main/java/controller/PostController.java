/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import entity.Post;
import entity.User;

/**
 *
 * @author Jhiven Agnar
 */
public class PostController {

    private ArrayList<Post> listPost;

    public PostController() {
        this.listPost = new ArrayList<>();
    }

    public ArrayList<Post> searchPost(String text, String kategori) {
        text = text.toLowerCase();
        ArrayList<Post> hasilCari = new ArrayList<>();

        for (Post post : listPost) {
            boolean keyword = text.isBlank() ? true : post.getJudul().toLowerCase().contains(text) || post.getNamaBarang().toLowerCase().contains(text);
            boolean checkKategori = kategori.equals("Semua") || post.getKategori().equals(kategori);

            if (keyword && checkKategori && !post.getTelahDitemukan()) {
                hasilCari.add(post);
            }
        }

        return hasilCari;
    }

    public ArrayList<Post> searchPost(String text, String kategori, User user) {
        text = text.toLowerCase();
        ArrayList<Post> hasilCari = new ArrayList<>();

        for (Post post : listPost) {
            boolean keyword = text.isBlank() ? true : post.getJudul().toLowerCase().contains(text) || post.getNamaBarang().toLowerCase().contains(text);
            boolean checkKategori = kategori.equals("Semua") || post.getKategori().equals(kategori);

            if (keyword && checkKategori && user == post.getDipostingOleh()) {
                hasilCari.add(post);
            }
        }

        return hasilCari;
    }

    public ArrayList<Post> searchPost(User user) {

        ArrayList<Post> hasilCari = new ArrayList<>();

        for (Post post : listPost) {
            if (post.getDipostingOleh() == user) {
                hasilCari.add(post);
            }
        }

        return hasilCari;
    }

    public void deleteUserPost(User user) {
        for (Post post : listPost) {
            if (post.getDipostingOleh() == user) {
                listPost.remove(post);
            }
        }
    }

    public void deletePost(Post post) {
        this.listPost.remove(post);
    }

    public void addPost(User user, String judul, String namaBarang, String alamat,
            String pathFoto, String deskripsi, String kategori) {
        Post post = new Post(user, namaBarang, alamat, judul, kategori);

        if (!pathFoto.isBlank()) {
            post.setPathFoto(pathFoto);
        }
        if (!deskripsi.isBlank()) {
            post.setDeskripsi(deskripsi);
        }

        this.listPost.add(post);
    }
}
