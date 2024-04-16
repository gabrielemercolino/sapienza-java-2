{
  description = "template dev flake";

  inputs = {
      nixpkgs.url = "github:nixos/nixpkgs/nixos-unstable";
    };

  outputs = { self, nixpkgs, ... }@inputs:
    let
      system = "x86_64-linux";
      pkgs = nixpkgs.legacyPackages.${system};
    in
    {
      devShells.${system}.default =
        pkgs.mkShell
          {
            nativeBuildInputs = with pkgs; [
              jdk21
              #jdk22
            ];

            shellHook = ''
            clear
            echo "Java environment activated" | ${pkgs.lolcat}/bin/lolcat
            exec zsh
            '';
          };
    };
}
