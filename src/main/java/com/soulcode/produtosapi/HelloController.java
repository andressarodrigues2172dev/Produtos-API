package com.soulcode.produtosapi;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @RequestMapping (value ="/elastech" , method = RequestMethod.POST)
    public String paginaelastech(@RequestParam String nome , @RequestParam int idade, Model model){
        if(idade >= 18){
            System.out.println();
            model.addAttribute("nome", nome);
            model.addAttribute("idade", idade);

            return "cadastro-maior18";
        }else{
            int anosPara18 =  18 - idade ;
            model.addAttribute("nome", nome);
            model.addAttribute("idade", idade);
            model.addAttribute("idadeFaltando", anosPara18);
            return "Cadastro-menor18";
        }

    }

    @GetMapping("/soulcode")
    @ResponseBody
    public String paginaelastech2(){
        return "Soul Code pagina teste";
    }

@GetMapping("/cadastro-produto")
    public String cadastroProduto(){
        return "cadastro";
}
    @GetMapping("/cadastro-usuario")
    public String cadastroUsuario(){
        return "cadastro-usuario";
    }
@GetMapping("/menu")
public String menuhtml(){
        return "Menu.html";
}
}
