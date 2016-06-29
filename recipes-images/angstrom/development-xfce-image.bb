# Image with a GNOME2 desktop and various development tools installed

require development-image.bb


IMAGE_INSTALL += " \
	packagegroup-xfce-base \
	packagegroup-gnome-xserver-base \
	packagegroup-core-x11-xserver \
	packagegroup-gnome-fonts \
	angstrom-gnome-icon-theme-enable gtk-engine-clearlooks gtk-theme-clearlooks angstrom-clearlooks-theme-enable \
	\
	angstrom-gdm-autologin-hack angstrom-gdm-xfce-hack gdm \
	\
	connman-gnome \
"

export IMAGE_BASENAME = "development-XFCE-image"

IMAGE_PREPROCESS_COMMAND += "do_delete_gnome_session ; "

do_delete_gnome_session () {
	rm -f ${IMAGE_ROOTFS}${datadir}/xsessions/gnome.desktop
}
