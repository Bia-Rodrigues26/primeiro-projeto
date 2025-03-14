public class teste {
  //https://echo.hoppscotch.io/projeto2025/projeto2025 => POST
  @PostMapping("/CriarCliente")
  public String CriarCliente(@RequestBody Cliente entity){
          
      return "Cliente " +Cliente.getNome() + " de idade "+Cliente.getIdade();

  }
}
