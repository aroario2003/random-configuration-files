# random-configuration-files

## Information

The openbox configuration gives openbox the ability to tile windows. This configuration is for people who want to experiment with tiling windows and discover if a tiling window manager is right for them.  

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

Now we need to reconfigure openbox so that my configuration will take effect on your machine

To do that:

`openbox --reconfigure`

## Openbox-3 (theme installation)

Installing the theme is the same as installing the configuration except we have to copy this file into a different directory, the directory is:

`/usr/share/themes/PacBang`

Once you are in that directory:

`rm -rf openbox-3`

The above step only applies if you have the PacBang theme in your `/usr/share/themes` directory. If the file is not there then do not execute the above command.

Instead execute:

`mkdir PacBang` 

While still in `/usr/share/themes`

Now we have to copy the `openbox-3` dierectory within `random-configuration-files` to `/usr/share/themes/PacBang`

Within `~/.config/random-configuration-files` execute the following:

`sudo cp -r ~/.config/random-configuration-files/openbox-3 /usr/share/themes/PacBang`

Once you have done that you will have to reboot your machine for the changes to take effect.

## Keybindings

`Super+Enter` open a terminal

`Super+Arrow-keys` cycle workspaces

`Super+1-7` go to specified workspace

`Alt+arrow-keys` make window occupy half of that area of the screen

`Alt+Shift+hjkl` make window occupy that edge of the screen (four window tiling)

`Ctrl+arrow-keys` cycle focus in that direction

`Super+Shift+n` open nitrogen

`Super+Shift+l` open libreoffice 

`Super+Shift+s` switch to standard resolution (1920x1080)

`Super+f` open a file manager

`Super+w` open a web browser

`Super+q` quit any window

`Ctrl+f` make a window fullsreen with gaps

`Super+Shift+d` run dmenu

## Updates

This repository will be updated every week or two once I finish putting in all the configuration files that I want to put in here. I will be putting my `.zshrc` file in here shortly and I will be customizing and updating it along with the other ocnfiguration files. In this section I will be letting you know whenever I make changes to a file and what I did. If you have any questions or concerns please let me know. 

## Contact Me

If you encounter an error or think that my configuration could be improved, you can DM me in Discord my username is `thelegend27#1582` please contact me there if you have any questions or concerns.
