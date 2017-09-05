clc;close all;   
for i=1:77
tifFilename = strcat( num2str(i), '.tif');
  ired = imread(tifFilename);
% separate RGB planes
iredr=ired(:,:,1);
iredg=ired(:,:,2);
iredb=ired(:,:,3);
% find the mean reflectance values
m5=mean2(iredr);
m2=mean2(iredg);
m1=mean2(iredb);
% show the red,green, blue images
iredr=ired(:,:,1);
iredg=ired(:,:,2);
iredb=ired(:,:,3);
% take the size of cropped image
[row,col]=size(iredr);
% set the counter for no. of pixels with orange values
orangecnt=0;
% create new image with values of orange pixels only
iredor=uint8(zeros(row,col));
% scan image for range of R,G,B values for orange colour combination
for x=1:1:row-2
    for y=1:1:col-2
        if(253<iredr(x,y)<255 && 128<iredg(x,y)<130 && 0<iredb(x,y)<30)
              orangecnt=orangecnt+1;
              iredor(x,y)=(iredr(x,y)+iredb(x,y)+iredg(x,y))/3;
        end
    end
end
  % find the reflectance value of orange colour
  m4=mean2(iredor);
% same for yellow colour
yellowcnt=0;
iredyl=uint8(zeros(row,col));
for x=1:1:row-2
    for y=1:1:col-2
        if(253<iredr(x,y)<255 && 253<iredg(x,y)<255 && 0<iredb(x,y)<10)
            yellowcnt=yellowcnt+1;
            iredyl(x,y)=(iredr(x,y)+iredg(x,y)+iredb(x,y))/3;
        end
    end
end
m3=mean2(iredyl);
% plot the reflectance spectrum
x = [470,500,580,600,700];  %wavelengths of blue,green,yellow,orange,red
yred = [m1,m2,m3,m4,m5];
yarr(i,:)= yred;
title('reflectance vs wavelength plot');
xlabel('wavelength') % x-axis label
ylabel('reflectance values') % y-axis label
end