//package mk.finki.ukim.wp.lab.repository.inMemory;
//
//import mk.finki.ukim.wp.lab.bootstrap.DataHolder;
//import mk.finki.ukim.wp.lab.model.Artist;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class InMemoryArtistRepository {
//
//    public List<Artist> findAll(){
//        return DataHolder.artistList;
//    }
//    public Artist findById(Long id){
//        return DataHolder.artistList.stream().filter(i->i.getId().equals(id)).findFirst().orElse(null);
//    }
//}
