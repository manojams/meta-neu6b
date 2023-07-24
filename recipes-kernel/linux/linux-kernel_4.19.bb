SECTION = "kernel"
DESCRIPTION = "Linux-4.19 ECM BSP kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

require recipes-kernel/linux/linux-yocto.inc

inherit kernel

SRC_URI = " \
	git://git@github.com/edgeble/kernel.git;protocol=ssh;branch=neu2a-4.19 \
	file://${THISDIR}/files/cgroups.cfg \
"

SRCREV = "8f0fde4d2375ff0d839eb980cc221eb72c03e60a"

S = "${WORKDIR}/git"
B = "${WORKDIR}/build"

DEPENDS += "openssl-native util-linux-native"
