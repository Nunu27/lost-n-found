/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelompok_empat.controller;

import java.util.ArrayList;
import kelompok_empat.entity.Post;
import kelompok_empat.entity.User;

/**
 *
 * @author Jhiven Agnar
 */
public class PostController {
    private ArrayList<Post> listPost;
    
    public PostController(){
        this.listPost = new ArrayList<>();
    }
    
    public ArrayList<Post> cariPost(String text, String kategori){
        
        ArrayList<Post> hasilCari = new ArrayList<>();
        
        for(Post post : listPost){
            if((post.getJudul().contains(text) || post.getNamaBarang().contains(text)) && 
                   (kategori.equals("semua") || post.getKategori().equals(kategori))){
                hasilCari.add(post);
            }
        }
        
        return hasilCari;
    }
    
    public void hapusPost(Post post){
        this.listPost.remove(post);
    }
    
    public void tambahPost(User user, String namaBarang, String alamat, 
            String judul, String pathFoto, String deskripsi, String kategori){
        this.listPost.add(new Post(user, namaBarang, alamat, judul, kategori));
        
        if(!pathFoto.isBlank()){
            this.listPost.get(this.listPost.size()-1).setPathFoto(pathFoto);
        }
        
        if(!deskripsi.isBlank()){
            this.listPost.get(this.listPost.size()-1).setDeskripsi(deskripsi);
        }
    }
}
