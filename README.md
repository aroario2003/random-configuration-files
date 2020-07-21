# random-configuration-files

## Information

The openbox configuration gives openbox the ability to tile windows.  

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
