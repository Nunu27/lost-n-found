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

    public ArrayList<Post> cariPost(String text, String kategori) {
        text = text.toLowerCase();
        ArrayList<Post> hasilCari = new ArrayList<>();

        for (Post post : listPost) {
            boolean keyword = text.isBlank() ? true : post.getJudul().toLowerCase().contains(text) || post.getNamaBarang().toLowerCase().contains(text);
            boolean checkKategori = kategori.equals("Semua") || post.getKategori().equals(kategori);

            if (keyword && checkKategori) {
                hasilCari.add(post);
            }
        }

        return hasilCari;
    }

    public ArrayList<Post> cariPost(User user) {

        ArrayList<Post> hasilCari = new ArrayList<>();

        for (Post post : listPost) {
            if (post.getDipostingOleh() == user) {
                hasilCari.add(post);
            }
        }

        return hasilCari;
    }

    public void hapusPost(Post post) {
        this.listPost.remove(post);
    }

    public void tambahPost(User user, String judul, String namaBarang, String alamat,
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
