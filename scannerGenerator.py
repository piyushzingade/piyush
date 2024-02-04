import qrcode
from PIL import Image

# Get the phone number from the user
anything = input("Enter anything you want to convert in QRcode: ")

# Create a QR code
qr = qrcode.QRCode(
    version=1,
    error_correction=qrcode.constants.ERROR_CORRECT_L,
    box_size=10,
    border=4,
)
qr.add_data("tel:" + anything)
qr.make(fit=True)

# Create an image from the QR code
img = qr.make_image(fill_color="black", back_color="white")

# Save the QR code image
img.save("qrcode.png")

print("QR code generated and saved as 'qrcode.png'")
