package study;

public class Song {
  // 노래 제목을 나타내는 title /
  // - 가수를 나타내는 artist- 노래가 속한 앨범 제목을 나타내는 album /
  // - 노래가 발표된 연도를 나타내는 year-
  // 노래의 작곡가를 나타내는 composer,
  // 단 작곡가는 3명이라고 간주한다.

  String title;
  String artist;
  String year;
  String album;
  String composer;

  public void setTitle(String title1){
    title = title1;
  }

  public void setArtist(String artist1){
    artist = artist1;
  }

  public void setYear(String year1){
    year = year1;
  }

  public void setAlbum(String album1){
    album = album1;
  }
  public void setComposer(String composer1){
    composer = composer1;
  }



  public void print(){
    System.out.println("노래제목 :" + title);
    System.out.println("가수 :" + artist);
    System.out.println("연도 :" + year);
    System.out.println("작곡가 :" + composer);

  }

}
