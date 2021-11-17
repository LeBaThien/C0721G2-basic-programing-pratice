package application.controller;

import application.model.Song;
import application.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {
    @Autowired
    private ISongService songService ;

    @GetMapping("")
    public String index(Model model) {
        List<Song> songList = songService.findAll();
        model.addAttribute("songs", songList);
        return "/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("songs", new Song());
        return "/create";
    }

    @PostMapping("/save")
    public String save(Song song) {
//        song.setId((int) (Math.random() * 10000));
        songService.save(song);
        return "redirect:/songs";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("songs", songService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Song song) {
        songService.update(song.getId(), song);
        return "redirect:/songs";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("songs", songService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Song song, RedirectAttributes redirect) {
        songService.remove(song.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/songs";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("songs", songService.findById(id));
        return "/view";
    }
}
