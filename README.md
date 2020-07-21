# random-configuration-files

## information

The openbox configuration gives openbox the ability to tile windows.Read the important information document in Libreoffice.
All information about keybindings is in the important information file. 

## Installation
`
We need to copy the openbox folder to ~/.config

In order to accomplish this we will have to use the following commands

`cd ~/.config`

`rm -rf openbox`

The above command `rm -rf openbox` only applies if you have that file in your .config directory

Then:

`git clone https://github.com/aroario2003/random-configuration-files.git`

Once you have my repository in your `~/.config` directory

Use the following:

`cd random-configuration-files`

`sudo cp -r ~/.config/random-configuration-files/openbox  ~/.config`
