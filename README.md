# Member Registration System

E-ticaret sisteminde sisteme kayıt ve sisteme giriş için gerekli işlemlerin yapılacağı bir Back-End sisteminin kurulması.

## Sistem Gereksinimleri;
***Kullanıcılar sisteme bilgilerini girerek üye olabilmelidir***
 - Sisteme temel kullanıcı bilgileri , e-posta ve parolayla üye olunabilmelidir. Temel kullanıcı bilgileri : ad, soyad, e-posta, parola. Temel bilgilerin tamamı zorunludur.
 - Parola en az 6 karakterden oluşmalıdır.
 - E-posta alanı e-posta formatında olmalıdır. (Regex Entegresi Yapıldı)
 - E-Posta daha önce kullanılmamış olmalıdır.
 - Ad ve soyad en az iki karakterden oluşmalıdır.
 - Üyelik sonucu kullanıcıya doğrulama e-postası gönderilmelidir. (Simulasyon)
 - Doğrulama linki tıklandığında üyelik tamamlanmalıdır. (Simulasyon)
 - Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.

***Kullanıcılar sisteme Google hesapları ile üye olabilmelidir. (Simulasyon)***
- İlerleyen zamanlarda başka yetkilendirme servisleri de kullanılabilir.
- Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.

***Kullanıcılar e-posta ve parola bilgisiyle sisteme giriş yapabilmelidir.***
- E-posta ve parola zorunludur.
- Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.
